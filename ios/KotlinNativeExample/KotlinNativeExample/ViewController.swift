//
//  ViewController.swift
//  KotlinNativeExample
//
//  Created by Tomasz Kiszka on 08/12/2020.
//

import UIKit
import app

class ViewController: UIViewController {
    
    @IBAction func testKotlinNativeButtonTouchUpInside(_ sender: UIButton) {
        let alert = UIAlertController(title: "Kotlin native test",
                                      message: Utils().helloWorld(),
                                      preferredStyle: .alert)
        let actionDismiss = UIAlertAction(title: "Dismiss", style: .default, handler: nil)
        alert.addAction(actionDismiss)
        present(alert, animated: true, completion: nil)
    }
    
}

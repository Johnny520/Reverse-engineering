package net.bytebuddy.dynamic;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface VisibilityBridgeStrategy {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Default implements VisibilityBridgeStrategy {
        ALWAYS { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.1
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return true;
            }
        },
        ON_NON_GENERIC_METHOD { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.2
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return !methodDescription.isGenerified();
            }
        },
        NEVER { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.3
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return false;
            }
        }
    }

    boolean generateVisibilityBridge(MethodDescription methodDescription);
}

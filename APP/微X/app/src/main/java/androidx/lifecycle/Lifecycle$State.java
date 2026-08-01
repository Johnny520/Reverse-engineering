// Decompiled by JEB v5.42.0.202606242140

package androidx.lifecycle;

public enum Lifecycle.State {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public boolean isAtLeast(Lifecycle.State lifecycle$State0) {
        return this.compareTo(lifecycle$State0) >= 0;
    }
}


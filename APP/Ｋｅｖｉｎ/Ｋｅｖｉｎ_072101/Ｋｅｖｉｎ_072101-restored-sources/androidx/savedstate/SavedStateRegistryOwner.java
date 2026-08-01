package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistryOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m115d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedstate_release"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public interface SavedStateRegistryOwner extends androidx.lifecycle.LifecycleOwner {
    androidx.savedstate.SavedStateRegistry getSavedStateRegistry();
}

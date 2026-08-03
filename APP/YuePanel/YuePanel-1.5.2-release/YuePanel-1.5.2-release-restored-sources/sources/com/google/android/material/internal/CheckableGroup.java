package com.google.android.material.internal;

import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8086;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
@InterfaceC8086
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@InterfaceC6391 Set<Integer> set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(@InterfaceC6391 MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            uncheckInternal(t, false);
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(@InterfaceC6391 MaterialCheckable<T> materialCheckable, boolean z) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean zRemove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return zRemove;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T extends com.google.android.material.internal.MaterialCheckable<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        this.checkables.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
        }
        t.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: onCheckedChanged(Ljava/lang/Object;Z)V */
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t2, boolean z) {
                if (!z) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!checkableGroup.uncheckInternal(t2, checkableGroup.selectionRequired)) {
                        return;
                    }
                } else if (!CheckableGroup.this.checkInternal(t2)) {
                    return;
                }
                CheckableGroup.this.onCheckedStateChanged();
            }
        });
    }

    public void check(@InterfaceC5411 int i) {
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null && checkInternal(t)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z = !this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z) {
            onCheckedStateChanged();
        }
    }

    @InterfaceC6391
    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    @InterfaceC6391
    public List<Integer> getCheckedIdsSortedByChildOrder(@InterfaceC6391 ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @InterfaceC5411
    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t) {
        t.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t.getId()));
        this.checkedIds.remove(Integer.valueOf(t.getId()));
    }

    public void setOnCheckedStateChangeListener(@InterfaceC6490 OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.selectionRequired = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.singleSelection != z) {
            this.singleSelection = z;
            clearCheck();
        }
    }

    public void uncheck(@InterfaceC5411 int i) {
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null && uncheckInternal(t, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}

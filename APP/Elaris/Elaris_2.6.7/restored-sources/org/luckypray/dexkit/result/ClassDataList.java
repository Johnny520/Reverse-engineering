package org.luckypray.dexkit.result;

import java.util.Collection;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassDataList extends BaseDataList<ClassData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDataList(Collection<ClassData> collection) {
        super(collection);
        collection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ClassData) {
            return contains((ClassData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassDataList findClass(FindClass findClass) {
        findClass.getClass();
        if (isEmpty()) {
            return new ClassDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findClass.searchIn(this);
        return bridge$dexkit_android_release.findClass(findClass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldDataList findField(FindField findField) {
        findField.getClass();
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findField.searchInClass(this);
        return bridge$dexkit_android_release.findField(findField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodDataList findMethod(FindMethod findMethod) {
        findMethod.getClass();
        if (isEmpty()) {
            return new MethodDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findMethod.searchInClass(this);
        return bridge$dexkit_android_release.findMethod(findMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ClassData) {
            return indexOf((ClassData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ClassData) {
            return lastIndexOf((ClassData) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClassData) {
            return remove((ClassData) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ ClassData removeAt(int i) {
        return remove(i);
    }

    public ClassDataList(int i) {
        super(i);
    }

    public ClassDataList() {
    }

    public /* bridge */ boolean contains(ClassData classData) {
        return super.contains((Object) classData);
    }

    public /* bridge */ int indexOf(ClassData classData) {
        return super.indexOf((Object) classData);
    }

    public /* bridge */ int lastIndexOf(ClassData classData) {
        return super.lastIndexOf((Object) classData);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassData remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(ClassData classData) {
        return super.remove((Object) classData);
    }

    public final /* synthetic */ ClassDataList findClass(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FindClass findClass = new FindClass();
        interfaceC0482u5.invoke(findClass);
        return findClass(findClass);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FindField findField = new FindField();
        interfaceC0482u5.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC0482u5 interfaceC0482u5) {
        interfaceC0482u5.getClass();
        FindMethod findMethod = new FindMethod();
        interfaceC0482u5.invoke(findMethod);
        return findMethod(findMethod);
    }
}

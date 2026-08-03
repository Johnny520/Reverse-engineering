package org.luckypray.dexkit.result;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC6399;
import java.util.Collection;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindField;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u0003\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ&\u0010\f\u001a\u00020\u00002\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0016J&\u0010\u0014\u001a\u00020\u00152\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0014\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001bJ&\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/result/BaseDataList;", "Lorg/luckypray/dexkit/result/ClassData;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "initialCapacity", "(I)V", "", "elements", "(Ljava/util/Collection;)V", "Lorg/luckypray/dexkit/query/FindClass;", "findClass", "(Lorg/luckypray/dexkit/query/FindClass;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lkotlin/Function1;", "LYue/ۥۣۢ۠ۤ;", "LYue/ۥ۠ۡۥۧ;", "init", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/ClassDataList;", "Lorg/luckypray/dexkit/query/FindMethod;", "findMethod", "Lorg/luckypray/dexkit/result/MethodDataList;", "(Lorg/luckypray/dexkit/query/FindMethod;)Lorg/luckypray/dexkit/result/MethodDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/MethodDataList;", "Lorg/luckypray/dexkit/query/FindField;", "findField", "Lorg/luckypray/dexkit/result/FieldDataList;", "(Lorg/luckypray/dexkit/query/FindField;)Lorg/luckypray/dexkit/result/FieldDataList;", "(LYue/ۥۣ۠ۡ۟;)Lorg/luckypray/dexkit/result/FieldDataList;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class ClassDataList extends BaseDataList<ClassData> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassDataList() {
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
    @InterfaceC6399
    public final ClassDataList findClass(@InterfaceC6399 FindClass findClass) {
        C5499.m17103(findClass, "findClass");
        if (isEmpty()) {
            return new ClassDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findClass.searchIn(this);
        return bridge$dexkit_android_release.findClass(findClass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final FieldDataList findField(@InterfaceC6399 FindField findField) {
        C5499.m17103(findField, "findField");
        if (isEmpty()) {
            return new FieldDataList();
        }
        DexKitBridge bridge$dexkit_android_release = first().getBridge$dexkit_android_release();
        findField.searchInClass(this);
        return bridge$dexkit_android_release.findField(findField);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public final MethodDataList findMethod(@InterfaceC6399 FindMethod findMethod) {
        C5499.m17103(findMethod, "findMethod");
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
    @Override // org.luckypray.dexkit.result.BaseDataList, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClassData remove(int i) {
        return removeAt(i);
    }

    @Override // org.luckypray.dexkit.result.BaseDataList
    public /* bridge */ ClassData removeAt(int i) {
        return (ClassData) super.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClassDataList(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ boolean contains(ClassData classData) {
        return super.contains((Object) classData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int indexOf(ClassData classData) {
        return super.indexOf((Object) classData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* bridge */ int lastIndexOf(ClassData classData) {
        return super.lastIndexOf((Object) classData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClassData) {
            return remove((ClassData) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassDataList(@InterfaceC6399 Collection<ClassData> collection) {
        super(collection);
        C5499.m17103(collection, "elements");
    }

    public /* bridge */ boolean remove(ClassData classData) {
        return super.remove((Object) classData);
    }

    public final /* synthetic */ ClassDataList findClass(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindClass findClass = new FindClass();
        init.invoke(findClass);
        return findClass(findClass);
    }

    public final /* synthetic */ FieldDataList findField(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindField findField = new FindField();
        init.invoke(findField);
        return findField(findField);
    }

    public final /* synthetic */ MethodDataList findMethod(InterfaceC5124 init) {
        C5499.m17103(init, "init");
        FindMethod findMethod = new FindMethod();
        init.invoke(findMethod);
        return findMethod(findMethod);
    }
}

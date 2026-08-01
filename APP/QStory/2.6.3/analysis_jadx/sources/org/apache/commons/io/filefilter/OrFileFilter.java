package org.apache.commons.io.filefilter;

import bsh.C2664;
import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import p359.AbstractC8915;
import p359.C8912;
import p359.C8913;
import p359.C8914;
import p359.InterfaceC8911;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OrFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final List<InterfaceC8911> fileFilters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(InterfaceC8911... interfaceC8911Arr) {
        this(interfaceC8911Arr.length);
        Objects.requireNonNull(interfaceC8911Arr, "fileFilters");
        addFileFilter(interfaceC8911Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$0(File file, InterfaceC8911 interfaceC8911) {
        return interfaceC8911.accept(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$1(File file, String str, InterfaceC8911 interfaceC8911) {
        return interfaceC8911.accept(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$2(Path path, BasicFileAttributes basicFileAttributes, InterfaceC8911 interfaceC8911) {
        return interfaceC8911.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE;
    }

    @Override // p359.InterfaceC8911
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractC8915.toDefaultFileVisitResult(this.fileFilters.stream().anyMatch(new C8914(path, basicFileAttributes, 1)));
    }

    public void addFileFilter(InterfaceC8911... interfaceC8911Arr) {
        Objects.requireNonNull(interfaceC8911Arr, "fileFilters");
        Stream.of((Object[]) interfaceC8911Arr).forEach(new C2664(this, 6));
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 and(InterfaceC8911 interfaceC8911) {
        return new AndFileFilter(this, interfaceC8911);
    }

    public List<InterfaceC8911> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    @Override // p359.InterfaceC8911, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8911
    public InterfaceC8911 negate() {
        return new NotFileFilter(this);
    }

    public InterfaceC8911 or(InterfaceC8911 interfaceC8911) {
        return new OrFileFilter(this, interfaceC8911);
    }

    public boolean removeFileFilter(InterfaceC8911 interfaceC8911) {
        return this.fileFilters.remove(interfaceC8911);
    }

    public void setFileFilters(List<InterfaceC8911> list) {
        this.fileFilters.clear();
        List<InterfaceC8911> list2 = this.fileFilters;
        Objects.requireNonNull(list, "fileFilters");
        list2.addAll(list);
    }

    @Override // p359.AbstractC8915
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.fileFilters, sb);
        sb.append(")");
        return sb.toString();
    }

    private OrFileFilter(ArrayList<InterfaceC8911> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    private OrFileFilter(int i) {
        this((ArrayList<InterfaceC8911>) new ArrayList(i));
    }

    public OrFileFilter() {
        this(0);
    }

    public OrFileFilter(InterfaceC8911 interfaceC8911, InterfaceC8911 interfaceC89112) {
        this(2);
        addFileFilter(interfaceC8911);
        addFileFilter(interfaceC89112);
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.fileFilters.stream().anyMatch(new C8912(str, file, 1));
    }

    public void addFileFilter(InterfaceC8911 interfaceC8911) {
        List<InterfaceC8911> list = this.fileFilters;
        Objects.requireNonNull(interfaceC8911, "fileFilter");
        list.add(interfaceC8911);
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return this.fileFilters.stream().anyMatch(new C8913(file, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(List<InterfaceC8911> list) {
        this((ArrayList<InterfaceC8911>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}

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
public class AndFileFilter extends AbstractC8915 implements Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    private final List<InterfaceC8911> fileFilters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(InterfaceC8911... interfaceC8911Arr) {
        this(interfaceC8911Arr.length);
        Objects.requireNonNull(interfaceC8911Arr, "fileFilters");
        addFileFilter(interfaceC8911Arr);
    }

    private boolean isEmpty() {
        return this.fileFilters.isEmpty();
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
        return isEmpty() ? FileVisitResult.TERMINATE : AbstractC8915.toDefaultFileVisitResult(this.fileFilters.stream().allMatch(new C8914(path, basicFileAttributes, 0)));
    }

    public void addFileFilter(InterfaceC8911... interfaceC8911Arr) {
        Objects.requireNonNull(interfaceC8911Arr, "fileFilters");
        Stream.of((Object[]) interfaceC8911Arr).forEach(new C2664(this, 5));
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
        this.fileFilters.addAll(list);
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

    private AndFileFilter(ArrayList<InterfaceC8911> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    private AndFileFilter(int i) {
        this((ArrayList<InterfaceC8911>) new ArrayList(i));
    }

    public AndFileFilter() {
        this(0);
    }

    public AndFileFilter(InterfaceC8911 interfaceC8911, InterfaceC8911 interfaceC89112) {
        this(2);
        addFileFilter(interfaceC8911);
        addFileFilter(interfaceC89112);
    }

    public void addFileFilter(InterfaceC8911 interfaceC8911) {
        List<InterfaceC8911> list = this.fileFilters;
        Objects.requireNonNull(interfaceC8911, "fileFilter");
        list.add(interfaceC8911);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndFileFilter(List<InterfaceC8911> list) {
        this((ArrayList<InterfaceC8911>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !isEmpty() && this.fileFilters.stream().allMatch(new C8912(str, file, 0));
    }

    @Override // p359.AbstractC8915, p359.InterfaceC8911, java.io.FileFilter
    public boolean accept(File file) {
        return !isEmpty() && this.fileFilters.stream().allMatch(new C8913(file, 0));
    }
}

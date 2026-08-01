package org.apache.commons.io.filefilter;

import bsh.C2663;
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
import p359.AbstractC8925;
import p359.C8922;
import p359.C8923;
import p359.C8924;
import p359.InterfaceC8921;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class OrFileFilter extends AbstractC8925 implements Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final List<InterfaceC8921> fileFilters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(InterfaceC8921... interfaceC8921Arr) {
        this(interfaceC8921Arr.length);
        Objects.requireNonNull(interfaceC8921Arr, "fileFilters");
        addFileFilter(interfaceC8921Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$0(File file, InterfaceC8921 interfaceC8921) {
        return interfaceC8921.accept(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$1(File file, String str, InterfaceC8921 interfaceC8921) {
        return interfaceC8921.accept(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$2(Path path, BasicFileAttributes basicFileAttributes, InterfaceC8921 interfaceC8921) {
        return interfaceC8921.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE;
    }

    @Override // p359.InterfaceC8921
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractC8925.toDefaultFileVisitResult(this.fileFilters.stream().anyMatch(new C8924(path, basicFileAttributes, 1)));
    }

    public void addFileFilter(InterfaceC8921... interfaceC8921Arr) {
        Objects.requireNonNull(interfaceC8921Arr, "fileFilters");
        Stream.of((Object[]) interfaceC8921Arr).forEach(new C2663(this, 6));
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 and(InterfaceC8921 interfaceC8921) {
        return new AndFileFilter(this, interfaceC8921);
    }

    public List<InterfaceC8921> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    @Override // p359.InterfaceC8921, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p359.InterfaceC8921
    public InterfaceC8921 negate() {
        return new NotFileFilter(this);
    }

    public InterfaceC8921 or(InterfaceC8921 interfaceC8921) {
        return new OrFileFilter(this, interfaceC8921);
    }

    public boolean removeFileFilter(InterfaceC8921 interfaceC8921) {
        return this.fileFilters.remove(interfaceC8921);
    }

    public void setFileFilters(List<InterfaceC8921> list) {
        this.fileFilters.clear();
        List<InterfaceC8921> list2 = this.fileFilters;
        Objects.requireNonNull(list, "fileFilters");
        list2.addAll(list);
    }

    @Override // p359.AbstractC8925
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.fileFilters, sb);
        sb.append(")");
        return sb.toString();
    }

    private OrFileFilter(ArrayList<InterfaceC8921> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    private OrFileFilter(int i) {
        this((ArrayList<InterfaceC8921>) new ArrayList(i));
    }

    public OrFileFilter() {
        this(0);
    }

    public OrFileFilter(InterfaceC8921 interfaceC8921, InterfaceC8921 interfaceC89212) {
        this(2);
        addFileFilter(interfaceC8921);
        addFileFilter(interfaceC89212);
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.fileFilters.stream().anyMatch(new C8922(str, file, 1));
    }

    public void addFileFilter(InterfaceC8921 interfaceC8921) {
        List<InterfaceC8921> list = this.fileFilters;
        Objects.requireNonNull(interfaceC8921, "fileFilter");
        list.add(interfaceC8921);
    }

    @Override // p359.AbstractC8925, p359.InterfaceC8921, java.io.FileFilter
    public boolean accept(File file) {
        return this.fileFilters.stream().anyMatch(new C8923(file, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(List<InterfaceC8921> list) {
        this((ArrayList<InterfaceC8921>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}

package org.apache.commons.p014io.filefilter;

import bsh.C3497;
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
import p375.AbstractC9744;
import p375.C9741;
import p375.C9742;
import p375.C9743;
import p375.InterfaceC9740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OrFileFilter extends AbstractC9744 implements Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final List<InterfaceC9740> fileFilters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(InterfaceC9740... interfaceC9740Arr) {
        this(interfaceC9740Arr.length);
        Objects.requireNonNull(interfaceC9740Arr, "fileFilters");
        addFileFilter(interfaceC9740Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$0(File file, InterfaceC9740 interfaceC9740) {
        return interfaceC9740.accept(file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$1(File file, String str, InterfaceC9740 interfaceC9740) {
        return interfaceC9740.accept(file, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$accept$2(Path path, BasicFileAttributes basicFileAttributes, InterfaceC9740 interfaceC9740) {
        return interfaceC9740.accept(path, basicFileAttributes) == FileVisitResult.CONTINUE;
    }

    @Override // p375.InterfaceC9740
    public FileVisitResult accept(Path path, BasicFileAttributes basicFileAttributes) {
        return AbstractC9744.toDefaultFileVisitResult(this.fileFilters.stream().anyMatch(new C9743(path, basicFileAttributes, 1)));
    }

    public void addFileFilter(InterfaceC9740... interfaceC9740Arr) {
        Objects.requireNonNull(interfaceC9740Arr, "fileFilters");
        Stream.of((Object[]) interfaceC9740Arr).forEach(new C3497(this, 6));
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 and(InterfaceC9740 interfaceC9740) {
        return new AndFileFilter(this, interfaceC9740);
    }

    public List<InterfaceC9740> getFileFilters() {
        return Collections.unmodifiableList(this.fileFilters);
    }

    @Override // p375.InterfaceC9740, java.nio.file.PathMatcher
    public /* bridge */ /* synthetic */ boolean matches(Path path) {
        return super.matches(path);
    }

    @Override // p375.InterfaceC9740
    public InterfaceC9740 negate() {
        return new NotFileFilter(this);
    }

    /* JADX INFO: renamed from: or */
    public InterfaceC9740 m520or(InterfaceC9740 interfaceC9740) {
        return new OrFileFilter(this, interfaceC9740);
    }

    public boolean removeFileFilter(InterfaceC9740 interfaceC9740) {
        return this.fileFilters.remove(interfaceC9740);
    }

    public void setFileFilters(List<InterfaceC9740> list) {
        this.fileFilters.clear();
        List<InterfaceC9740> list2 = this.fileFilters;
        Objects.requireNonNull(list, "fileFilters");
        list2.addAll(list);
    }

    @Override // p375.AbstractC9744
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        append(this.fileFilters, sb);
        sb.append(")");
        return sb.toString();
    }

    private OrFileFilter(ArrayList<InterfaceC9740> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.fileFilters = arrayList;
    }

    private OrFileFilter(int i) {
        this((ArrayList<InterfaceC9740>) new ArrayList(i));
    }

    public OrFileFilter() {
        this(0);
    }

    public OrFileFilter(InterfaceC9740 interfaceC9740, InterfaceC9740 interfaceC97402) {
        this(2);
        addFileFilter(interfaceC9740);
        addFileFilter(interfaceC97402);
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.fileFilters.stream().anyMatch(new C9741(str, file, 1));
    }

    public void addFileFilter(InterfaceC9740 interfaceC9740) {
        List<InterfaceC9740> list = this.fileFilters;
        Objects.requireNonNull(interfaceC9740, "fileFilter");
        list.add(interfaceC9740);
    }

    @Override // p375.AbstractC9744, p375.InterfaceC9740, java.io.FileFilter
    public boolean accept(File file) {
        return this.fileFilters.stream().anyMatch(new C9742(file, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrFileFilter(List<InterfaceC9740> list) {
        this((ArrayList<InterfaceC9740>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}

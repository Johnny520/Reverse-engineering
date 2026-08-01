.class public Ltop/linl/dexparser/Main;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance p0, Ljava/io/File;

    .line 2
    .line 3
    const-string v0, "D:\\JADX\\QQ_8.9.85.apk"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ltop/linl/dexparser/DexFinder;->builder(Ljava/lang/String;)Ltop/linl/dexparser/DexFinder$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ltop/linl/dexparser/DexFinder$Builder;->build()Ltop/linl/dexparser/DexFinder;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 21
    .line 22
    const-string v1, "doOnBackEvent"

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ltop/linl/dexparser/DexFinder;->testFindMethodString(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

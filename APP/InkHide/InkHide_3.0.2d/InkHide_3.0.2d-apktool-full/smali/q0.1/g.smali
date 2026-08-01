.class public final Lq0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# virtual methods
.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    sget-boolean p1, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/OptionData;->getViewWxDbPw()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "classLoader"

    .line 22
    .line 23
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 27
    .line 28
    const-string v0, "com.tencent.wcdb.database.SQLiteDatabase"

    .line 29
    .line 30
    invoke-interface {p2, p1, v0}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v7, LA0/x;

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-direct {v7, p2}, LA0/x;-><init>(I)V

    .line 38
    .line 39
    .line 40
    const-string v3, "com.tencent.wcdb.database.SQLiteDatabase$CursorFactory"

    .line 41
    .line 42
    const-string v4, "int"

    .line 43
    .line 44
    const-string v0, "java.lang.String"

    .line 45
    .line 46
    const-string v1, "[B"

    .line 47
    .line 48
    const-string v2, "com.tencent.wcdb.database.SQLiteCipherSpec"

    .line 49
    .line 50
    const-string v5, "com.tencent.wcdb.DatabaseErrorHandler"

    .line 51
    .line 52
    const-string v6, "int"

    .line 53
    .line 54
    filled-new-array/range {v0 .. v7}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const-string v0, "openDatabase"

    .line 59
    .line 60
    invoke-static {p1, v0, p2}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

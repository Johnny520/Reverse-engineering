.class public final La/x3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltop/mmjz/floatingclouds/plugin/IPlugin;


# instance fields
.field public final a:La/Me;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/w3;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La/w3;-><init>(I)V

    new-instance v1, La/Me;

    invoke-direct {v1, v0}, La/Me;-><init>(La/s7;)V

    iput-object v1, p0, La/x3;->a:La/Me;

    return-void
.end method


# virtual methods
.method public final handleHook(La/J8;)V
    .locals 6

    const-string v0, "session"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, La/J8;->a:Ljava/lang/ClassLoader;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v1, "com.tencent.wcdb.database.SQLiteDatabase"

    invoke-static {v0, v1}, La/A1;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    new-instance v1, La/g2;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, La/g2;-><init>(I)V

    invoke-static {v0, v1}, La/A1;->f(Ljava/lang/Class;La/D7;)[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {p1, v3}, La/J8;->f(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    move-result-object v3

    new-instance v4, La/m2;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0}, La/m2;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v4}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

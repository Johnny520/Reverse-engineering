.class public abstract Lc0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH/a;

.field public static b:Ld0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LH/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LA0/a;

    .line 7
    .line 8
    const/16 v2, 0x15

    .line 9
    .line 10
    invoke-direct {v1, v2}, LA0/a;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, LH/a;->b:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v1, LA0/a;

    .line 16
    .line 17
    const/16 v2, 0x16

    .line 18
    .line 19
    invoke-direct {v1, v2}, LA0/a;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, LH/a;->c:Ljava/lang/Object;

    .line 23
    .line 24
    sput-object v0, Lc0/f;->a:LH/a;

    .line 25
    .line 26
    sget-object v0, Lc0/e;->b:Ld0/b;

    .line 27
    .line 28
    sput-object v0, Lc0/f;->b:Ld0/b;

    .line 29
    .line 30
    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static varargs b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2}, Ld0/a;->h(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static varargs c(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1, p2, p3}, Ld0/a;->n(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static d(Ljava/lang/reflect/Member;Lc0/a;)V
    .locals 1

    .line 1
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Ld0/a;->e(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.class public final Lzb;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/reflect/Method;

.field public final synthetic c:Lec;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/reflect/Field;

.field public final synthetic f:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;Lec;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzb;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lzb;->b:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    iput-object p3, p0, Lzb;->c:Lec;

    .line 6
    .line 7
    iput-object p4, p0, Lzb;->d:Ljava/lang/Class;

    .line 8
    .line 9
    iput-object p5, p0, Lzb;->e:Ljava/lang/reflect/Field;

    .line 10
    .line 11
    iput-object p6, p0, Lzb;->f:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const/16 p1, 0x14

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 6
    .line 7
    :goto_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    return-void

    .line 10
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v5, p0, Lzb;->e:Ljava/lang/reflect/Field;

    .line 15
    .line 16
    iget-object v6, p0, Lzb;->f:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    iget-object v1, p0, Lzb;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v2, p0, Lzb;->b:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    iget-object v3, p0, Lzb;->c:Lec;

    .line 23
    .line 24
    iget-object v4, p0, Lzb;->d:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static/range {v0 .. v6}, Lfc;->H(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Method;Lec;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/ClassLoader;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

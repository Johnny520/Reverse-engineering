.class public final Lcom/lu/wxmask/App;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Q;


# static fields
.field public static final Companion:Lm0/a;

.field public static instance:Lcom/lu/wxmask/App;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm0/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lu/wxmask/App;->Companion:Lm0/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getViewModelStore()Landroidx/lifecycle/P;
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/P;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/P;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/lu/wxmask/App;->Companion:Lm0/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sput-object p0, Lcom/lu/wxmask/App;->instance:Lcom/lu/wxmask/App;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sput-object p0, Lb1/h;->i:Landroid/content/Context;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sput-object v0, Lb1/h;->i:Landroid/content/Context;

    .line 21
    .line 22
    :goto_0
    sget-object v0, Lz0/d;->a:Lz0/c;

    .line 23
    .line 24
    new-instance v1, Lr0/n1;

    .line 25
    .line 26
    const/16 v2, 0x15

    .line 27
    .line 28
    invoke-direct {v1, v2}, Lr0/n1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {v0, v2, v1}, Lz0/c;->h(ZLM0/l;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lv0/b;->b(Landroid/content/ContextWrapper;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

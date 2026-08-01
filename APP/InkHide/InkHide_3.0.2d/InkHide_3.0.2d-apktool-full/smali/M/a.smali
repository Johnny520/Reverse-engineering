.class public final synthetic LM/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final synthetic a:LM/d;


# direct methods
.method public synthetic constructor <init>(LM/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM/a;->a:LM/d;

    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    iget-object p1, p0, LM/a;->a:LM/d;

    .line 2
    .line 3
    const-string v0, "this$0"

    .line 4
    .line 5
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p1, LM/d;->c:Z

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 17
    .line 18
    if-ne p2, v0, :cond_1

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    iput-boolean p2, p1, LM/d;->c:Z

    .line 22
    .line 23
    :cond_1
    return-void
.end method

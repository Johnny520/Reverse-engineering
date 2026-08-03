.class public final Landroidx/lifecycle/w$a;
.super Landroidx/lifecycle/g;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/w;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/y;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/w$a;->this$0:Landroidx/lifecycle/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/lifecycle/w$a;->this$0:Landroidx/lifecycle/y;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/lifecycle/y;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/lifecycle/w$a;->this$0:Landroidx/lifecycle/y;

    .line 5
    .line 6
    iget v0, p1, Landroidx/lifecycle/y;->g:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    add-int/2addr v0, v1

    .line 10
    iput v0, p1, Landroidx/lifecycle/y;->g:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p1, Landroidx/lifecycle/y;->j:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p1, Landroidx/lifecycle/y;->l:Landroidx/lifecycle/s;

    .line 19
    .line 20
    sget-object v1, Landroidx/lifecycle/k;->ON_START:Landroidx/lifecycle/k;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p1, Landroidx/lifecycle/y;->j:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method

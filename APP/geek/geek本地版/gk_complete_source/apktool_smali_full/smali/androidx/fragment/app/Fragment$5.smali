.class Landroidx/fragment/app/Fragment$5;
.super Ljava/lang/Object;

# interfaces
.implements Lmq;


# instance fields
.field public final synthetic a:Lml;


# direct methods
.method public constructor <init>(Lml;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/Fragment$5;->a:Lml;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Loq;Liq;)V
    .locals 0

    .line 1
    sget-object p1, Liq;->ON_STOP:Liq;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/Fragment$5;->a:Lml;

    .line 6
    .line 7
    iget-object p1, p1, Lml;->E:Landroid/view/View;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

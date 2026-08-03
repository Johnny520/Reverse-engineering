.class public final L۟/x7;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "L\u06df/a3;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/content/Context;

.field public final synthetic ۥ۟:L۟/t7;


# direct methods
.method public constructor <init>(Landroid/app/Activity;L۟/t7;)V
    .locals 0

    iput-object p1, p0, L۟/x7;->ۥ:Landroid/content/Context;

    iput-object p2, p0, L۟/x7;->ۥ۟:L۟/t7;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, L۟/a3;

    .line 2
    .line 3
    iget-object v1, p0, L۟/x7;->ۥ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, L۟/a3;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L۟/x7;->ۥ۟:L۟/t7;

    .line 9
    .line 10
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 11
    .line 12
    const/4 v3, -0x1

    .line 13
    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 21
    .line 22
    .line 23
    iget-object v2, v1, L۟/t7;->ۥ۠ۧ:L۟/kb;

    .line 24
    .line 25
    invoke-virtual {v2}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, L۟/t7$a;

    .line 30
    .line 31
    invoke-virtual {v0, v2}, L۟/kc;->setAdapter(L۟/p7;)V

    .line 32
    .line 33
    .line 34
    iget v2, v1, L۟/t7;->ۥ۠ۥ:I

    .line 35
    .line 36
    invoke-virtual {v0, v2}, L۟/kc;->setCurrentItem(I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, L۟/w7;

    .line 40
    .line 41
    invoke-direct {v2, v1}, L۟/w7;-><init>(L۟/t7;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, L۟/kc;->setOnPageChangeListener(L۟/kc$h;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

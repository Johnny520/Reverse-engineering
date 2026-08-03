.class public Landroidx/appcompat/app/ۥ۟۟۟ۢ;
.super Landroidx/appcompat/app/ۥ;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/ActionBarOverlayLayout$ۥ۟۟۟;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;,
        Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۢۡ:Ljava/lang/String; = "WindowDecorActionBar"

.field public static final ۥ۟۟ۢۢ:Landroid/view/animation/Interpolator;

.field public static final ۥۣ۟۟ۢ:Landroid/view/animation/Interpolator;

.field public static final ۥ۟۟ۢۤ:I = -0x1

.field public static final ۥ۟۟ۢۥ:J = 0x64L

.field public static final ۥ۟۟ۢۦ:J = 0xc8L


# instance fields
.field public ۥۣ۟۟۟:Landroid/content/Context;

.field public ۥ۟۟۟ۤ:Landroid/content/Context;

.field public ۥ۟۟۟ۥ:Landroid/app/Activity;

.field public ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

.field public ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

.field public ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

.field public ۥ۟۟۠۟:Landroid/view/View;

.field public ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

.field public ۥ۟۟۠ۡ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/appcompat/app/\u06e5\u06df\u06df\u06df\u06e2$\u06e5\u06df\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

.field public ۥ۟۟۠ۦ:LYue/ۥ۟۟ۧ۟;

.field public ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

.field public ۥ۟۟۠ۨ:Z

.field public ۥ۟۟ۡ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/appcompat/app/\u06e5$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟ۡ۟:Z

.field public ۥ۟۟ۡ۠:I

.field public ۥ۟۟ۡۡ:Z

.field public ۥ۟۟ۡۢ:Z

.field public ۥۣ۟۟ۡ:Z

.field public ۥ۟۟ۡۤ:Z

.field public ۥ۟۟ۡۥ:Z

.field public ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

.field public ۥ۟۟ۡۧ:Z

.field public ۥ۟۟ۡۨ:Z

.field public final ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

.field public final ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

.field public final ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۢ:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۢ:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/ۥ;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    .line 7
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    .line 8
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

    .line 9
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

    .line 10
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;

    .line 11
    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:Landroid/app/Activity;

    .line 12
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۡ(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroidx/appcompat/app/ۥ;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 18
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    .line 22
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    .line 23
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

    .line 24
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

    .line 25
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;

    .line 26
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۡ(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Landroidx/appcompat/app/ۥ;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 29
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 31
    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    .line 33
    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    .line 34
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

    .line 35
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

    .line 36
    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;

    .line 37
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۡ(Landroid/view/View;)V

    return-void
.end method

.method public static ۥ۟۟ۦۡ(ZZZ)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    return v0

    :cond_0
    if-nez p0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    return-void
.end method

.method public ۥ۟۟۟()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۟()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢۤۦۧ;->ۥ()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟ۢ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Z)V

    return-void
.end method

.method public ۥۣ۟۟۟(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;IZ)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;IZ)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۧ()V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;IZ)V

    invoke-virtual {p0, p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۤ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;I)V

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۧ()V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Z)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۤ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;I)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۨ(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۨ:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۨ:Z

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/ۥ$ۥ۟۟۟;

    invoke-interface {v2, p1}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟;->ۥ(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟۟۠()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۦ()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠۟()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۨ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۠()F
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۢۧ(Landroid/view/View;)F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۡ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۢ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I

    move-result v0

    return v0
.end method

.method public ۥۣ۟۟۠()I
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۨ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢۢ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۤ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۨ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۥ()I
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۨ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const/4 v2, -0x1

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۟()I

    move-result v2

    :cond_1
    return v2

    :cond_2
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠ۦ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۠ۧ()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۧ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۨ(I)Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;

    return-object p1
.end method

.method public ۥ۟۟ۡ()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۟()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v2, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟۟ۥ:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۤ:Landroid/content/Context;

    return-object v0
.end method

.method public ۥ۟۟ۡ۠()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۡ()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟ۡ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ۥ۟۟۠ۥ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡۤ()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ()I

    move-result v0

    iget-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ()I

    move-result v1

    if-ge v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۡۥ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠۟()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۡۦ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;
    .locals 1

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;)V

    return-object v0
.end method

.method public ۥ۟۟ۡۧ(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-static {p1}, LYue/ۥ۟۟ۦۨ;->ۥ۟(Landroid/content/Context;)LYue/ۥ۟۟ۦۨ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟۟ۦۨ;->ۥ۟۟۟ۡ()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۢ(Z)V

    return-void
.end method

.method public ۥ۟۟ۢ(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟()Landroid/view/Menu;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public ۥ۟۟ۢۡ()V
    .locals 0

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۢ()V

    return-void
.end method

.method public ۥ۟۟ۢۢ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥۣ۟۟ۢ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V
    .locals 0

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۤ(I)V

    return-void
.end method

.method public ۥ۟۟ۢۤ(I)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۟()I

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟۟۟ۦ(I)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz v1, :cond_2

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۢ(I)V

    :cond_2
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v2, p1

    :goto_1
    if-ge v2, v1, :cond_3

    iget-object v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-virtual {v3, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۢ(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    if-ne v0, p1, :cond_5

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    add-int/lit8 p1, p1, -0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    :cond_5
    return-void
.end method

.method public ۥ۟۟ۢۥ()Z
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥۣ۟۟ۡ()Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, -0x1

    if-eq v0, v1, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;->ۥ۟۟۟()I

    move-result v2

    :cond_0
    iput v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:Landroid/app/Activity;

    instance-of v0, v0, Landroidx/fragment/app/FragmentActivity;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥۣ۟۟ۡ()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۥ:Landroid/app/Activity;

    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۦ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-ne v1, p1, :cond_3

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۡ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;

    move-result-object v1

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-interface {v1, v2, v0}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;->ۥ۟۟(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Landroidx/fragment/app/ۥ۟۟۠۟;)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟۟(I)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;->ۥ۟۟۟()I

    move-result v2

    :cond_4
    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->setTabSelected(I)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۡ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;

    move-result-object v1

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-interface {v1, v2, v0}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;->ۥ۟(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Landroidx/fragment/app/ۥ۟۟۠۟;)V

    :cond_5
    check-cast p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۡ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;

    move-result-object p1

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-interface {p1, v1, v0}, Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;->ۥ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;Landroidx/fragment/app/ۥ۟۟۠۟;)V

    :cond_6
    :goto_1
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۡ۟()Z

    move-result p1

    if-nez p1, :cond_7

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠()I

    :cond_7
    return-void
.end method

.method public ۥ۟۟ۢۧ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۢۨ(I)V
    .locals 3

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v1}, LYue/ۥ۟ۨۤۨ;->ۥۣ۟۟ۡ()Landroid/view/ViewGroup;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟(Landroid/view/View;)V

    return-void
.end method

.method public ۥۣ۟۟(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢ۠(Landroid/view/View;)V

    return-void
.end method

.method public ۥۣ۟۟۟(Landroid/view/View;Landroidx/appcompat/app/ۥ$ۥ۟;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p2, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢ۠(Landroid/view/View;)V

    return-void
.end method

.method public ۥۣ۟۟۠(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ(Z)V

    :cond_0
    return-void
.end method

.method public ۥۣ۟۟ۡ(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣۣ۟۟(II)V

    return-void
.end method

.method public ۥۣ۟۟ۢ(I)V
    .locals 1

    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Z

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠۠(I)V

    return-void
.end method

.method public ۥۣۣ۟۟(II)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۨ()I

    move-result v0

    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Z

    :cond_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠۠(I)V

    return-void
.end method

.method public ۥۣ۟۟ۤ(Z)V
    .locals 1

    const/16 v0, 0x10

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣۣ۟۟(II)V

    return-void
.end method

.method public ۥۣ۟۟ۥ(Z)V
    .locals 1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣۣ۟۟(II)V

    return-void
.end method

.method public ۥۣ۟۟ۦ(Z)V
    .locals 1

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣۣ۟۟(II)V

    return-void
.end method

.method public ۥۣ۟۟ۧ(Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣۣ۟۟(II)V

    return-void
.end method

.method public ۥۣ۟۟ۨ(F)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v0, p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠ۢۢ(Landroid/view/View;F)V

    return-void
.end method

.method public ۥ۟۟ۤ(I)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ۥ۟۟۠ۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    return-void
.end method

.method public ۥ۟۟ۤ۟(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ۥ۟۟۠ۦ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۨ:Z

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    return-void
.end method

.method public ۥ۟۟ۤ۠(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢ۟(I)V

    return-void
.end method

.method public ۥ۟۟ۤۡ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۡ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۤۢ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۡ(I)V

    return-void
.end method

.method public ۥۣ۟۟ۤ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢۤ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۤۤ(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۤ(Z)V

    return-void
.end method

.method public ۥ۟۟ۤۥ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->setIcon(I)V

    return-void
.end method

.method public ۥ۟۟ۤۦ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۤۧ(Landroid/widget/SpinnerAdapter;Landroidx/appcompat/app/ۥ$ۥ۟۟۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    new-instance v1, Landroidx/appcompat/app/ۥ۟۟۟۠;

    invoke-direct {v1, p2}, Landroidx/appcompat/app/ۥ۟۟۟۠;-><init>(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۟;)V

    invoke-interface {v0, p1, v1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۥ(Landroid/widget/SpinnerAdapter;Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public ۥ۟۟ۤۨ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->setLogo(I)V

    return-void
.end method

.method public ۥ۟۟ۥ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۨ(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۥ۟(I)V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۨ()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ()I

    move-result v2

    iput v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    if-eq v0, p1, :cond_1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_1

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡ۠(I)V

    const/4 v0, 0x0

    if-eq p1, v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۧ()V

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_3

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۥ۠(I)V

    iput v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    :cond_3
    :goto_1
    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    const/4 v3, 0x1

    if-ne p1, v1, :cond_4

    iget-boolean v4, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    if-nez v4, :cond_4

    move v4, v3

    goto :goto_2

    :cond_4
    move v4, v0

    :goto_2
    invoke-interface {v2, v4}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢۥ(Z)V

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-ne p1, v1, :cond_5

    iget-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    if-nez p1, :cond_5

    move v0, v3

    :cond_5
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method public ۥ۟۟ۥ۠(I)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۨ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setSelectedNavigationIndex not valid for current navigation mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۥ(I)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۥۡ(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۧ:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۤۦۧ;->ۥ()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۥۢ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟ۥۣ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContainer;->setStackedBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۥ۟۟ۥۤ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۥۥ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۥۥ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۠ۢ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۥۦ(I)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۥۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۥۧ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۥۨ(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۨۤۨ;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۥ۟۟ۦ()V
    .locals 1

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۦ۟(LYue/ۥ۟۟ۧ۟$ۥ;)LYue/ۥ۟۟ۧ۟;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->ۥۣ۟۟۠()V

    new-instance v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟ۢ;Landroid/content/Context;LYue/ۥ۟۟ۧ۟$ۥ;)V

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥ۟۟۠ۢ()Z

    move-result p1

    if-eqz p1, :cond_1

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟;->ۥۣ۟۟۟()V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۠۠(LYue/ۥ۟۟ۧ۟;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦ۠(Z)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟ۦ۠(Z)V
    .locals 8

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۤ()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧ۠()V

    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۧ()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    const-wide/16 v4, 0xc8

    const-wide/16 v6, 0x64

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1, v2, v6, v7}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡ۟(IJ)LYue/ۥۢۤۦۦ;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v3, v4, v5}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۟ۨ(IJ)LYue/ۥۢۤۦۦ;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1, v3, v4, v5}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡ۟(IJ)LYue/ۥۢۤۦۦ;

    move-result-object v0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1, v6, v7}, Landroidx/appcompat/widget/ActionBarContextView;->ۥ۟۟۟ۨ(IJ)LYue/ۥۢۤۦۦ;

    move-result-object p1

    :goto_1
    new-instance v1, LYue/ۥۢۤۦۧ;

    invoke-direct {v1}, LYue/ۥۢۤۦۧ;-><init>()V

    invoke-virtual {v1, p1, v0}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟(LYue/ۥۢۤۦۦ;LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;

    invoke-virtual {v1}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟ۢ()V

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1, v2}, LYue/ۥ۟ۨۤۨ;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1, v3}, LYue/ۥ۟ۨۤۨ;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public final ۥ۟۟ۦۢ()V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۢ:Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۦ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;)V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/widget/ۥ۟۟۟۟;->ۥ۟۟۟ۥ()V

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۠:I

    return-void
.end method

.method public ۥ۟۟ۦۣ()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۟۟ۧ۟;

    invoke-interface {v0, v1}, LYue/ۥ۟۟ۧ۟$ۥ;->ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۟۟ۧ۟;

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۧ:LYue/ۥ۟۟ۧ۟$ۥ;

    :cond_0
    return-void
.end method

.method public final ۥ۟۟ۦۤ(Landroidx/appcompat/app/ۥ$ۥ۟۟۟۠;I)V
    .locals 1

    check-cast p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-virtual {p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۡ()Landroidx/appcompat/app/ۥ$ۥ۟۟۟ۡ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۢ(I)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    add-int/lit8 p2, p2, 0x1

    if-ge p2, p1, :cond_0

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۢ(I)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Action Bar Tab must have a Callback"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۦۥ(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢۤۦۧ;->ۥ()V

    :cond_0
    iget v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۧ:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, LYue/ۥۢۤۦۧ;

    invoke-direct {v0}, LYue/ۥۢۤۦۧ;-><init>()V

    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    filled-new-array {p1, p1}, [I

    move-result-object p1

    iget-object v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p1, v1

    int-to-float p1, p1

    sub-float/2addr v2, p1

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object p1

    invoke-virtual {p1, v2}, LYue/ۥۢۤۦۦ;->ۥ۟۟ۡ۠(F)LYue/ۥۢۤۦۦ;

    move-result-object p1

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;

    invoke-virtual {p1, v1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۧ(LYue/ۥۢۤۧ۟;)LYue/ۥۢۤۦۦ;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۧ;->ۥ۟۟(LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;

    iget-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    if-eqz p1, :cond_3

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object p1

    invoke-virtual {p1, v2}, LYue/ۥۢۤۦۦ;->ۥ۟۟ۡ۠(F)LYue/ۥۢۤۦۦ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۧ;->ۥ۟۟(LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;

    :cond_3
    sget-object p1, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢۢ:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۠(Landroid/view/animation/Interpolator;)LYue/ۥۢۤۦۧ;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟(J)LYue/ۥۢۤۦۧ;

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟ۡ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۧ;

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    invoke-virtual {v0}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟ۢ()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ:LYue/ۥۢۤۦۨ;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LYue/ۥۢۤۦۨ;->ۥ۟(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟ۦۦ(Z)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢۤۦۧ;->ۥ()V

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۠:I

    const/4 v2, 0x0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۧ:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_2

    filled-new-array {v1, v1}, [I

    move-result-object p1

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1, p1}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x1

    aget p1, p1, v1

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_2
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    new-instance p1, LYue/ۥۢۤۦۧ;

    invoke-direct {p1}, LYue/ۥۢۤۦۧ;-><init>()V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v1}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object v1

    invoke-virtual {v1, v2}, LYue/ۥۢۤۦۦ;->ۥ۟۟ۡ۠(F)LYue/ۥۢۤۦۦ;

    move-result-object v1

    iget-object v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۧ۟;

    invoke-virtual {v1, v3}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۧ(LYue/ۥۢۤۧ۟;)LYue/ۥۢۤۦۦ;

    invoke-virtual {p1, v1}, LYue/ۥۢۤۦۧ;->ۥ۟۟(LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;

    iget-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥۢۤۦۦ;

    move-result-object v0

    invoke-virtual {v0, v2}, LYue/ۥۢۤۦۦ;->ۥ۟۟ۡ۠(F)LYue/ۥۢۤۦۦ;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۧ;->ۥ۟۟(LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;

    :cond_3
    sget-object v0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۢ:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۠(Landroid/view/animation/Interpolator;)LYue/ۥۢۤۦۧ;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟(J)LYue/ۥۢۤۦۧ;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

    invoke-virtual {p1, v0}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟ۡ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۧ;

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۦ:LYue/ۥۢۤۦۧ;

    invoke-virtual {p1}, LYue/ۥۢۤۦۧ;->ۥ۟۟۟ۢ()V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V

    iget-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۡ:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۟:Landroid/view/View;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v2}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۢ۟:LYue/ۥۢۤۦۨ;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LYue/ۥۢۤۦۨ;->ۥ۟(Landroid/view/View;)V

    :goto_0
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_6

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    :cond_6
    return-void
.end method

.method public final ۥ۟۟ۦۧ()V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/widget/ۥ۟۟۟۟;

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroidx/appcompat/widget/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    iget-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v1, v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۧ(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_3

    invoke-static {v1}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    :goto_1
    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    return-void
.end method

.method public final ۥ۟۟ۦۨ(Landroid/view/View;)LYue/ۥ۟ۨۤۨ;
    .locals 3

    instance-of v0, p1, LYue/ۥ۟ۨۤۨ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۨۤۨ;

    return-object p1

    :cond_0
    instance-of v0, p1, Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getWrapper()LYue/ۥ۟ۨۤۨ;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    const-string p1, "null"

    :goto_0
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۧ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۧ۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟۠()Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟ۧ۠()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۤ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۤ:Z

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۧۡ(Landroid/view/View;)V
    .locals 5

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$ۥ۟۟۟;)V

    :cond_0
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۨ(Landroid/view/View;)LYue/ۥ۟ۨۤۨ;

    move-result-object v0

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ۟۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    if-eqz v0, :cond_7

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۡۨ()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Z

    :cond_2
    iget-object v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    invoke-static {v2}, LYue/ۥ۟۟ۦۨ;->ۥ۟(Landroid/content/Context;)LYue/ۥ۟۟ۦۨ;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥ۟۟ۦۨ;->ۥ()Z

    move-result v3

    if-nez v3, :cond_4

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move p1, v1

    goto :goto_2

    :cond_4
    :goto_1
    move p1, v0

    :goto_2
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۤۤ(Z)V

    invoke-virtual {v2}, LYue/ۥ۟۟ۦۨ;->ۥ۟۟۟ۡ()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۢ(Z)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟۟:Landroid/content/Context;

    sget-object v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ:[I

    sget v3, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۟۟۠:I

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v2, v3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v2, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۠۟:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۤ۟(Z)V

    :cond_5
    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۨ:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۨ(F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟ۧۢ(Z)V
    .locals 4

    iput-boolean p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1, v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۧ(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    invoke-interface {p1, v0}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟۟ۧ(Landroidx/appcompat/widget/ۥ۟۟۟۟;)V

    :goto_0
    invoke-virtual {p0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۠۠:Landroidx/appcompat/widget/ۥ۟۟۟۟;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_3

    invoke-static {v0}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠ۤ(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    :goto_2
    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۨ:LYue/ۥ۟ۨۤۨ;

    iget-boolean v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    if-nez v3, :cond_4

    if-eqz p1, :cond_4

    move v3, v1

    goto :goto_3

    :cond_4
    move v3, v2

    :goto_3
    invoke-interface {v0, v3}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟ۢۥ(Z)V

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡ۟:Z

    if-nez v3, :cond_5

    if-eqz p1, :cond_5

    goto :goto_4

    :cond_5
    move v1, v2

    :goto_4
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method public final ۥۣ۟۟ۧ()Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۧ:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟ۧۤ()V
    .locals 2

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۤ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۤ:Z

    iget-object v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟۟ۦ:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۧۥ(Z)V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۧۥ(Z)V
    .locals 3

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۢ:Z

    iget-boolean v1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥۣ۟۟ۡ:Z

    iget-boolean v2, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۤ:Z

    invoke-static {v0, v1, v2}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۡ(ZZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۦ(Z)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۡۥ:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/ۥ۟۟۟ۢ;->ۥ۟۟ۦۥ(Z)V

    :cond_1
    :goto_0
    return-void
.end method

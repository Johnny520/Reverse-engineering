.class public abstract Landroidx/fragment/app/ۥ۟۟۠۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:I = 0x0

.field public static final ۥ۟۟۠ۤ:I = 0x1

.field public static final ۥ۟۟۠ۥ:I = 0x2

.field public static final ۥ۟۟۠ۦ:I = 0x3

.field public static final ۥ۟۟۠ۧ:I = 0x4

.field public static final ۥ۟۟۠ۨ:I = 0x5

.field public static final ۥ۟۟ۡ:I = 0x6

.field public static final ۥ۟۟ۡ۟:I = 0x7

.field public static final ۥ۟۟ۡ۠:I = 0x8

.field public static final ۥ۟۟ۡۡ:I = 0x9

.field public static final ۥ۟۟ۡۢ:I = 0xa

.field public static final ۥۣ۟۟ۡ:I = 0x1000

.field public static final ۥ۟۟ۡۤ:I = 0x2000

.field public static final ۥ۟۟ۡۥ:I = -0x1

.field public static final ۥ۟۟ۡۦ:I = 0x0

.field public static final ۥ۟۟ۡۧ:I = 0x1001

.field public static final ۥ۟۟ۡۨ:I = 0x2002

.field public static final ۥ۟۟ۢ:I = 0x1003

.field public static final ۥ۟۟ۢ۟:I = 0x1004

.field public static final ۥ۟۟ۢ۠:I = 0x2005


# instance fields
.field public final ۥ:Landroidx/fragment/app/ۥ۟۟۟ۡ;

.field public final ۥ۟:Ljava/lang/ClassLoader;

.field public ۥ۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:I

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۦ:I

.field public ۥ۟۟۟ۧ:Ljava/lang/CharSequence;

.field public ۥ۟۟۟ۨ:I

.field public ۥ۟۟۠:Ljava/lang/CharSequence;

.field public ۥ۟۟۠۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠۠:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۡ:Z

.field public ۥ۟۟۠ۢ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۡ:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۟ۡ;

    .line 6
    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟:Ljava/lang/ClassLoader;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟ۡ;Ljava/lang/ClassLoader;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۡ:Z

    .line 11
    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۟ۡ;

    .line 12
    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟:Ljava/lang/ClassLoader;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟ۡ;Ljava/lang/ClassLoader;Landroidx/fragment/app/ۥ۟۟۠۟;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroidx/fragment/app/ۥ۟۟۠۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۠۟;-><init>(Landroidx/fragment/app/ۥ۟۟۟ۡ;Ljava/lang/ClassLoader;)V

    .line 14
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    .line 15
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    new-instance v1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    invoke-direct {v1, p2}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_0
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟:I

    .line 17
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۟:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۟:I

    .line 18
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۠:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۠:I

    .line 19
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ:I

    .line 20
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۢ:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۢ:I

    .line 21
    iget-boolean p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥۣ۟۟۟:Z

    iput-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥۣ۟۟۟:Z

    .line 22
    iget-boolean p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    iput-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    .line 23
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    .line 24
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۨ:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۨ:I

    .line 25
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠:Ljava/lang/CharSequence;

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠:Ljava/lang/CharSequence;

    .line 26
    iget p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۦ:I

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۦ:I

    .line 27
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ:Ljava/lang/CharSequence;

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ:Ljava/lang/CharSequence;

    .line 28
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 29
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    .line 30
    iget-object p2, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 31
    :cond_1
    iget-object p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    if-eqz p1, :cond_2

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    .line 33
    iget-object p2, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 34
    :cond_2
    iget-boolean p1, p3, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۡ:Z

    iput-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۡ:Z

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۧ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۧ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public final ۥ۟۟۟ۢ(ILjava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df;"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۤ(Ljava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۠(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥۣ۟۟۟(ILjava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df;"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۤ(Ljava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p4}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p2, Landroidx/fragment/app/Fragment;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, p2, v1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۧ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0
.end method

.method public final ۥ۟۟۟ۦ(Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۤ(Ljava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۥ(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟:I

    iput v0, p1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;->ۥ۟۟۟:I

    iget v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۟:I

    iput v0, p1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;->ۥ۟۟۟۟:I

    iget v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۠:I

    iput v0, p1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;->ۥ۟۟۟۠:I

    iget v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ:I

    iput v0, p1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;->ۥ۟۟۟ۡ:I

    return-void
.end method

.method public ۥ۟۟۟ۨ(Landroid/view/View;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {}, LYue/ۥۣ۠۟ۤ;->ۥ۟۟۟۠()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۥۧ(Landroid/view/View;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "\' has already been added to the transaction."

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۠:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A shared element with the source name \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "A shared element with the target name \'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unique transitionNames are required for all sharedElements"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object p0
.end method

.method public ۥ۟۟۠(Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥۣ۟۟۟:Z

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۥ:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This FragmentTransaction is not allowed to be added to the back stack."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠۟(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public abstract ۥ۟۟۠۠()I
.end method

.method public abstract ۥ۟۟۠ۡ()I
.end method

.method public abstract ۥ۟۟۠ۢ()V
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation
.end method

.method public abstract ۥۣ۟۟۠()V
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation
.end method

.method public final ۥ۟۟۠ۤ(Ljava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;
    .locals 2
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Landroidx/fragment/app/Fragment;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ:Landroidx/fragment/app/ۥ۟۟۟ۡ;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟:Ljava/lang/ClassLoader;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۟ۡ;->ۥ(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    :cond_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The FragmentManager must be attached to itshost to create a Fragment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۥ(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public ۥ۟۟۠ۦ()Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥۣ۟۟۟:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This transaction is already being added to the back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۠ۧ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V
    .locals 3
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p2, Landroidx/fragment/app/Fragment;->mPreviousWho:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p2, v0}, LYue/ۥۣ۠۟ۡ;->ۥۣ۟۟۟(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_1
    const-string v0, " now "

    const-string v1, ": was "

    if-eqz p3, :cond_4

    iget-object v2, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t change tag of fragment "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iput-object p3, p2, Landroidx/fragment/app/Fragment;->mTag:Ljava/lang/String;

    :cond_4
    if-eqz p1, :cond_8

    const/4 v2, -0x1

    if-eq p1, v2, :cond_7

    iget p3, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    if-eqz p3, :cond_6

    if-ne p3, p1, :cond_5

    goto :goto_1

    :cond_5
    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t change container ID of fragment "

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_6
    :goto_1
    iput p1, p2, Landroidx/fragment/app/Fragment;->mFragmentId:I

    iput p1, p2, Landroidx/fragment/app/Fragment;->mContainerId:I

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t add fragment "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " with tag "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " to container view with no id"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    new-instance p1, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    invoke-direct {p1, p4, p2}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Fragment "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " must be a public static class to be  properly recreated from instance state."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۨ(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public ۥ۟۟ۡ()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۤ:Z

    return v0
.end method

.method public ۥ۟۟ۡ۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۠(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۡۢ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۢ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۧ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must use non-zero containerViewId"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۡ(ILjava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            ")",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۡۤ(ILjava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۡۤ(ILjava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۠ۥ۠۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/fragment/app/\u06e5\u06df\u06df\u06e0\u06df;"
        }
    .end annotation

    invoke-virtual {p0, p2, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۤ(Ljava/lang/Class;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;

    move-result-object p2

    invoke-virtual {p0, p1, p2, p4}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۡۢ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۥ(Ljava/lang/Runnable;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۦ()Landroidx/fragment/app/ۥ۟۟۠۟;

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۢ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۢ:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۢ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ۥ۟۟ۡۦ(Z)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۤ(Z)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۧ(I)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥۢ۠ۡۢ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۨ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/CharSequence;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۨ:I

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۢ(I)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥۢ۠ۡۢ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۦ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/CharSequence;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۦ:I

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥ۟۟ۢ۠(II)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۡ(IIII)Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢۡ(IIII)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۟۠ۥۦ;
        .end annotation

        .annotation build LYue/ۥ۟۠ۧۢ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟:I

    iput p2, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۟:I

    iput p3, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟۠:I

    iput p4, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ:I

    return-object p0
.end method

.method public ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$State;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p1, p2}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public ۥۣ۟۟ۢ(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

.method public ۥ۟۟ۢۤ(Z)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۡ:Z

    return-object p0
.end method

.method public ۥ۟۟ۢۥ(I)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۢ:I

    return-object p0
.end method

.method public ۥ۟۟ۢۦ(I)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۢۧ(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;-><init>(ILandroidx/fragment/app/Fragment;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۧ(Landroidx/fragment/app/ۥ۟۟۠۟$ۥ;)V

    return-object p0
.end method

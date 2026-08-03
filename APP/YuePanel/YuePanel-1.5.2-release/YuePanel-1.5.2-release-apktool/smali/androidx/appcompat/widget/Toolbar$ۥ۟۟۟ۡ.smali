.class public Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;
.super Landroidx/appcompat/app/ۥ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/Toolbar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static final ۥ۟۟:I = 0x0

.field public static final ۥ۟۟۟:I = 0x1

.field public static final ۥ۟۟۟۟:I = 0x2


# instance fields
.field public ۥ۟:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, -0x2

    const/4 v1, -0x1

    .line 9
    invoke-direct {p0, v0, v1, p1}, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;-><init>(III)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(II)V

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    const p1, 0x800013

    .line 5
    iput p1, p0, Landroidx/appcompat/app/ۥ$ۥ۟;->ۥ:I

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(II)V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    .line 8
    iput p3, p0, Landroidx/appcompat/app/ۥ$ۥ۟;->ۥ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    .line 15
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    .line 16
    iput v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/app/ۥ$ۥ۟;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(Landroidx/appcompat/app/ۥ$ۥ۟;)V

    const/4 p1, 0x0

    .line 14
    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1}, Landroidx/appcompat/app/ۥ$ۥ۟;-><init>(Landroidx/appcompat/app/ۥ$ۥ۟;)V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    .line 12
    iget p1, p1, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    iput p1, p0, Landroidx/appcompat/widget/Toolbar$ۥ۟۟۟ۡ;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public ۥ(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 1

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    return-void
.end method

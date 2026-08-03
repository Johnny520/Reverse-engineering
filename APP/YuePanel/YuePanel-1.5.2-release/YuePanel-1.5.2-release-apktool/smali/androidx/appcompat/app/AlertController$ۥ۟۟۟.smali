.class public Landroidx/appcompat/app/AlertController$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/AlertController;->ۥ۟۟۠ۡ(Landroid/view/ViewGroup;Landroid/view/View;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/view/View;

.field public final synthetic ۥ۟:Landroid/view/View;

.field public final synthetic ۥ۟۟:Landroidx/appcompat/app/AlertController;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AlertController;Landroid/view/View;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/AlertController$ۥ۟۟۟;->ۥ۟۟:Landroidx/appcompat/app/AlertController;

    iput-object p2, p0, Landroidx/appcompat/app/AlertController$ۥ۟۟۟;->ۥ:Landroid/view/View;

    iput-object p3, p0, Landroidx/appcompat/app/AlertController$ۥ۟۟۟;->ۥ۟:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    iget-object p2, p0, Landroidx/appcompat/app/AlertController$ۥ۟۟۟;->ۥ:Landroid/view/View;

    iget-object p3, p0, Landroidx/appcompat/app/AlertController$ۥ۟۟۟;->ۥ۟:Landroid/view/View;

    invoke-static {p1, p2, p3}, Landroidx/appcompat/app/AlertController;->ۥ۟۟۟ۡ(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    return-void
.end method

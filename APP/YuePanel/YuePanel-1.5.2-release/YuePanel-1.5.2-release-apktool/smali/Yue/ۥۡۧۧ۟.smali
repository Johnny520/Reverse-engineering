.class public final synthetic LYue/ۥۡۧۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۡۡۡ;


# instance fields
.field public final synthetic ۥ:Landroid/view/ViewGroup$MarginLayoutParams;

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۧ۟;->ۥ:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, p0, LYue/ۥۡۧۧ۟;->ۥ۟:I

    iput p3, p0, LYue/ۥۡۧۧ۟;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;LYue/ۥۢۥۦ;)LYue/ۥۢۥۦ;
    .locals 3

    iget-object v0, p0, LYue/ۥۡۧۧ۟;->ۥ:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p0, LYue/ۥۡۧۧ۟;->ۥ۟:I

    iget v2, p0, LYue/ۥۡۧۧ۟;->ۥ۟۟:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/google/android/material/search/SearchView;->ۥ۟(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;LYue/ۥۢۥۦ;)LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

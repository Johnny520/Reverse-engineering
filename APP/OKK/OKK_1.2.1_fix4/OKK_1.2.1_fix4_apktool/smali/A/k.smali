.class public final LA/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/t;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I[LA/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LA/k;->a:I

    .line 3
    iput-object p2, p0, LA/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA/k;->b:Ljava/lang/Object;

    iput p2, p0, LA/k;->a:I

    return-void
.end method


# virtual methods
.method public j(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, LA/k;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v0, p0, LA/k;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    const/4 p1, 0x1

    return p1
.end method

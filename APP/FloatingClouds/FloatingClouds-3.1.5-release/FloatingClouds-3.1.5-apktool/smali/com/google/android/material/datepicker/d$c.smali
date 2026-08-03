.class public final Lcom/google/android/material/datepicker/d$c;
.super La/fc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/d;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/fc<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/d;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/d$c;->a:Lcom/google/android/material/datepicker/d;

    invoke-direct {p0}, La/fc;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/datepicker/d$c;->a:Lcom/google/android/material/datepicker/d;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/d;->H()La/I4;

    move-result-object v0

    invoke-interface {v0}, La/I4;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/material/datepicker/d;->H0:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/d;->H()La/I4;

    move-result-object v2

    invoke-virtual {p1}, Landroidx/fragment/app/b;->A()Landroid/content/Context;

    invoke-interface {v2}, La/I4;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p1, Lcom/google/android/material/datepicker/d;->H0:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/google/android/material/datepicker/d;->K0:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/d;->H()La/I4;

    move-result-object p1

    invoke-interface {p1}, La/I4;->h()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.class public final Lcom/google/android/material/datepicker/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/Bh;


# direct methods
.method public constructor <init>(La/Bh;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/h;->b:La/Bh;

    iput p2, p0, Lcom/google/android/material/datepicker/h;->a:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    iget-object p1, p0, Lcom/google/android/material/datepicker/h;->b:La/Bh;

    iget-object v0, p1, La/Bh;->d:Lcom/google/android/material/datepicker/c;

    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->a0:La/tb;

    iget v0, v0, La/tb;->b:I

    iget v1, p0, Lcom/google/android/material/datepicker/h;->a:I

    invoke-static {v1, v0}, La/tb;->k(II)La/tb;

    move-result-object v0

    iget-object p1, p1, La/Bh;->d:Lcom/google/android/material/datepicker/c;

    iget-object v1, p1, Lcom/google/android/material/datepicker/c;->Y:Lcom/google/android/material/datepicker/a;

    iget-object v2, v1, Lcom/google/android/material/datepicker/a;->a:La/tb;

    iget-object v3, v2, La/tb;->a:Ljava/util/Calendar;

    iget-object v4, v0, La/tb;->a:Ljava/util/Calendar;

    invoke-virtual {v4, v3}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v3

    if-gez v3, :cond_0

    move-object v0, v2

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lcom/google/android/material/datepicker/a;->b:La/tb;

    iget-object v2, v1, La/tb;->a:Ljava/util/Calendar;

    invoke-virtual {v4, v2}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    move-result v2

    if-lez v2, :cond_1

    move-object v0, v1

    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/c;->G(La/tb;)V

    sget-object v0, Lcom/google/android/material/datepicker/c$d;->a:Lcom/google/android/material/datepicker/c$d;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/c;->H(Lcom/google/android/material/datepicker/c$d;)V

    return-void
.end method

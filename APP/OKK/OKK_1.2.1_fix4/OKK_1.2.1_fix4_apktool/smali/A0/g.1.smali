.class public final LA0/g;
.super LA0/v;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LA0/u;I)V
    .locals 0

    iput p2, p0, LA0/g;->e:I

    invoke-direct {p0, p1}, LA0/v;-><init>(LA0/u;)V

    return-void
.end method


# virtual methods
.method public r()V
    .locals 2

    iget v0, p0, LA0/g;->e:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, LA0/v;->b:LA0/u;

    const/4 v1, 0x0

    iput-object v1, v0, LA0/u;->o:Landroid/view/View$OnLongClickListener;

    iget-object v0, v0, LA0/u;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-static {v0, v1}, LA0/p;->T(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

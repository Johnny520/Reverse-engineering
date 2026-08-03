.class public final synthetic Lr9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/EditText;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Lgg/s;

.field public final synthetic e:Landroid/widget/EditText;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;I)V
    .locals 0

    .line 1
    iput p5, p0, Lr9/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lr9/e;->b:Landroid/widget/EditText;

    .line 4
    .line 5
    iput-object p2, p0, Lr9/e;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p3, p0, Lr9/e;->d:Lgg/s;

    .line 8
    .line 9
    iput-object p4, p0, Lr9/e;->e:Landroid/widget/EditText;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Lr9/e;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr9/e;->e:Landroid/widget/EditText;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iget-object v1, p0, Lr9/e;->b:Landroid/widget/EditText;

    .line 10
    .line 11
    iget-object v2, p0, Lr9/e;->c:Landroid/widget/TextView;

    .line 12
    .line 13
    iget-object v3, p0, Lr9/e;->d:Lgg/s;

    .line 14
    .line 15
    invoke-static {v1, v2, v3, p1, v0}, Lr9/d0;->J0(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;Z)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Lr9/e;->e:Landroid/widget/EditText;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iget-object v1, p0, Lr9/e;->b:Landroid/widget/EditText;

    .line 23
    .line 24
    iget-object v2, p0, Lr9/e;->c:Landroid/widget/TextView;

    .line 25
    .line 26
    iget-object v3, p0, Lr9/e;->d:Lgg/s;

    .line 27
    .line 28
    invoke-static {v1, v2, v3, p1, v0}, Lr9/d0;->J0(Landroid/widget/EditText;Landroid/widget/TextView;Lgg/s;Landroid/widget/EditText;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

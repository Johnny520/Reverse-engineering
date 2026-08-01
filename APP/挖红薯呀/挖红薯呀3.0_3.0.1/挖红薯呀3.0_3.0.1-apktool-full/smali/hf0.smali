.class public final synthetic Lhf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lxt0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Lxt0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhf0;->a:Landroid/widget/TextView;

    .line 5
    .line 6
    iput-object p2, p0, Lhf0;->b:Lxt0;

    .line 7
    .line 8
    iput p3, p0, Lhf0;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhf0;->b:Lxt0;

    .line 2
    .line 3
    iget v1, p0, Lhf0;->c:I

    .line 4
    .line 5
    iget-object p0, p0, Lhf0;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-static {p0, v0, v1, p1}, Lvf0;->y(Landroid/widget/TextView;Lxt0;ILandroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

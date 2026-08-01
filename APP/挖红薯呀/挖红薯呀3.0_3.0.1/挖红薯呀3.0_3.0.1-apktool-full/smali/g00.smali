.class public final synthetic Lg00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lm00;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Lm00;Ljava/lang/String;Landroid/widget/LinearLayout;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg00;->a:Lm00;

    .line 5
    .line 6
    iput-object p2, p0, Lg00;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lg00;->c:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    iput p4, p0, Lg00;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg00;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    iget v1, p0, Lg00;->d:I

    .line 4
    .line 5
    iget-object v2, p0, Lg00;->a:Lm00;

    .line 6
    .line 7
    iget-object p0, p0, Lg00;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, p0, v0, v1, p1}, Lm00;->p(Lm00;Ljava/lang/String;Landroid/widget/LinearLayout;ILandroid/view/View;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

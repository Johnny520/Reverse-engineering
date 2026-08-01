.class public final synthetic Ltf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Landroid/content/SharedPreferences;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf0;->a:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, Ltf0;->b:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    iput-object p3, p0, Ltf0;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Ltf0;->d:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p5, p0, Ltf0;->e:Landroid/app/Dialog;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v3, p0, Ltf0;->d:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v4, p0, Ltf0;->e:Landroid/app/Dialog;

    .line 4
    .line 5
    iget-object v0, p0, Ltf0;->a:Landroid/widget/EditText;

    .line 6
    .line 7
    iget-object v1, p0, Ltf0;->b:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iget-object v2, p0, Ltf0;->c:Landroid/widget/TextView;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lvf0;->Q0(Landroid/widget/EditText;Landroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/content/Context;Landroid/app/Dialog;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

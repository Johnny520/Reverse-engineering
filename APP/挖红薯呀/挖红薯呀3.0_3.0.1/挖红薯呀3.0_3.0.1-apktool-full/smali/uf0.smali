.class public final synthetic Luf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luf0;->d:Landroid/content/Context;

    .line 5
    .line 6
    iput p2, p0, Luf0;->e:I

    .line 7
    .line 8
    iput p3, p0, Luf0;->f:I

    .line 9
    .line 10
    iput p4, p0, Luf0;->g:I

    .line 11
    .line 12
    iput-object p5, p0, Luf0;->h:Landroid/content/SharedPreferences;

    .line 13
    .line 14
    iput-object p6, p0, Luf0;->i:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v5, p0, Luf0;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iget-object v0, p0, Luf0;->d:Landroid/content/Context;

    .line 7
    .line 8
    iget v1, p0, Luf0;->e:I

    .line 9
    .line 10
    iget v2, p0, Luf0;->f:I

    .line 11
    .line 12
    iget v3, p0, Luf0;->g:I

    .line 13
    .line 14
    iget-object v4, p0, Luf0;->h:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-static/range {v0 .. v6}, Lvf0;->j(Landroid/content/Context;IIILandroid/content/SharedPreferences;Landroid/widget/TextView;Landroid/widget/LinearLayout;)Lna1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.class public final synthetic Lef0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Z

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef0;->d:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lef0;->e:Z

    .line 7
    .line 8
    iput p3, p0, Lef0;->f:I

    .line 9
    .line 10
    iput p4, p0, Lef0;->g:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lef0;->h:Z

    .line 13
    .line 14
    iput-object p6, p0, Lef0;->i:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v5, p0, Lef0;->i:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iget-object v0, p0, Lef0;->d:Landroid/content/Context;

    .line 7
    .line 8
    iget-boolean v1, p0, Lef0;->e:Z

    .line 9
    .line 10
    iget v2, p0, Lef0;->f:I

    .line 11
    .line 12
    iget v3, p0, Lef0;->g:I

    .line 13
    .line 14
    iget-boolean v4, p0, Lef0;->h:Z

    .line 15
    .line 16
    invoke-static/range {v0 .. v6}, Lvf0;->b0(Landroid/content/Context;ZIIZLandroid/content/SharedPreferences;Landroid/widget/LinearLayout;)Lna1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

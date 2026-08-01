.class public final synthetic Lnf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnf0;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lnf0;->e:Landroid/content/Context;

    .line 7
    .line 8
    iput p3, p0, Lnf0;->f:I

    .line 9
    .line 10
    iput p4, p0, Lnf0;->g:I

    .line 11
    .line 12
    iput p5, p0, Lnf0;->h:I

    .line 13
    .line 14
    iput-object p6, p0, Lnf0;->i:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v4, p0, Lnf0;->h:I

    .line 2
    .line 3
    iget-object v5, p0, Lnf0;->i:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iget-boolean v0, p0, Lnf0;->d:Z

    .line 6
    .line 7
    iget-object v1, p0, Lnf0;->e:Landroid/content/Context;

    .line 8
    .line 9
    iget v2, p0, Lnf0;->f:I

    .line 10
    .line 11
    iget v3, p0, Lnf0;->g:I

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lvf0;->y0(ZLandroid/content/Context;IIILandroid/content/SharedPreferences;)Lna1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.class public final synthetic Ljf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljf0;->d:Landroid/content/Context;

    .line 5
    .line 6
    iput p2, p0, Ljf0;->e:I

    .line 7
    .line 8
    iput p3, p0, Ljf0;->f:I

    .line 9
    .line 10
    iput p4, p0, Ljf0;->g:I

    .line 11
    .line 12
    iput-object p5, p0, Ljf0;->h:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p6, p0, Ljf0;->i:J

    .line 15
    .line 16
    iput-object p8, p0, Ljf0;->j:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v7, p0, Ljf0;->j:Ljava/lang/String;

    .line 2
    .line 3
    move-object v8, p1

    .line 4
    check-cast v8, Landroid/widget/LinearLayout;

    .line 5
    .line 6
    iget-object v0, p0, Ljf0;->d:Landroid/content/Context;

    .line 7
    .line 8
    iget v1, p0, Ljf0;->e:I

    .line 9
    .line 10
    iget v2, p0, Ljf0;->f:I

    .line 11
    .line 12
    iget v3, p0, Ljf0;->g:I

    .line 13
    .line 14
    iget-object v4, p0, Ljf0;->h:Ljava/lang/String;

    .line 15
    .line 16
    iget-wide v5, p0, Ljf0;->i:J

    .line 17
    .line 18
    invoke-static/range {v0 .. v8}, Lvf0;->x(Landroid/content/Context;IIILjava/lang/String;JLjava/lang/String;Landroid/widget/LinearLayout;)Lna1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

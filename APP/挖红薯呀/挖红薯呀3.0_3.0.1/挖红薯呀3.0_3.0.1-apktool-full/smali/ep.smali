.class public final synthetic Lep;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:Z

.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lep;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lep;->e:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lep;->f:Z

    .line 9
    .line 10
    iput-object p4, p0, Lep;->g:Landroid/content/Context;

    .line 11
    .line 12
    iput-wide p5, p0, Lep;->h:J

    .line 13
    .line 14
    iput-object p7, p0, Lep;->i:Ljava/lang/String;

    .line 15
    .line 16
    iput p8, p0, Lep;->j:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v6, p0, Lep;->i:Ljava/lang/String;

    .line 2
    .line 3
    iget v7, p0, Lep;->j:I

    .line 4
    .line 5
    iget-object v0, p0, Lep;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget v1, p0, Lep;->e:I

    .line 8
    .line 9
    iget-boolean v2, p0, Lep;->f:Z

    .line 10
    .line 11
    iget-object v3, p0, Lep;->g:Landroid/content/Context;

    .line 12
    .line 13
    iget-wide v4, p0, Lep;->h:J

    .line 14
    .line 15
    invoke-static/range {v0 .. v7}, Lhp;->n(Ljava/lang/String;IZLandroid/content/Context;JLjava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

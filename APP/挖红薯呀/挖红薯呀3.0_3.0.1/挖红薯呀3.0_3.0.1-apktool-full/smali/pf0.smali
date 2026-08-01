.class public final synthetic Lpf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ILandroid/content/Context;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lpf0;->d:Landroid/content/Context;

    .line 5
    .line 6
    iput p1, p0, Lpf0;->e:I

    .line 7
    .line 8
    iput p3, p0, Lpf0;->f:I

    .line 9
    .line 10
    iput p4, p0, Lpf0;->g:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lpf0;->g:I

    .line 2
    .line 3
    check-cast p1, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    iget-object v1, p0, Lpf0;->d:Landroid/content/Context;

    .line 6
    .line 7
    iget v2, p0, Lpf0;->e:I

    .line 8
    .line 9
    iget p0, p0, Lpf0;->f:I

    .line 10
    .line 11
    invoke-static {v1, v2, p0, v0, p1}, Lvf0;->E(Landroid/content/Context;IIILandroid/widget/LinearLayout;)Lna1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

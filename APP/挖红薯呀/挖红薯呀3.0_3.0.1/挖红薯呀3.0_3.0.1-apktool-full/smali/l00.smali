.class public final synthetic Ll00;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lm00;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lm00;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll00;->d:Lm00;

    .line 5
    .line 6
    iput p2, p0, Ll00;->e:I

    .line 7
    .line 8
    iput p3, p0, Ll00;->f:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ll00;->e:I

    .line 2
    .line 3
    iget v1, p0, Ll00;->f:I

    .line 4
    .line 5
    iget-object p0, p0, Ll00;->d:Lm00;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lm00;->A(Lm00;II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

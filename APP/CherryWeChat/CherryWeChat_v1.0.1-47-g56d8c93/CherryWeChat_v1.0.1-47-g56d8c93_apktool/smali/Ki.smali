.class public final LKi;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:I

.field public b:Lhi;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:LPn;

.field public i:LPn;


# direct methods
.method public constructor <init>(ILhi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LKi;->a:I

    .line 3
    iput-object p2, p0, LKi;->b:Lhi;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LKi;->c:Z

    .line 5
    sget-object p1, LPn;->e:LPn;

    iput-object p1, p0, LKi;->h:LPn;

    .line 6
    iput-object p1, p0, LKi;->i:LPn;

    return-void
.end method

.method public constructor <init>(ILhi;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, LKi;->a:I

    .line 9
    iput-object p2, p0, LKi;->b:Lhi;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, LKi;->c:Z

    .line 11
    sget-object p1, LPn;->e:LPn;

    iput-object p1, p0, LKi;->h:LPn;

    .line 12
    iput-object p1, p0, LKi;->i:LPn;

    return-void
.end method

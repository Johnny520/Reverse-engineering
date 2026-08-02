.class public final Ljc0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Ld9;

.field public b:Lf6;

.field public c:J

.field public d:I

.field public final e:Lsp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ljc0;->c:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Ljc0;->d:I

    .line 10
    .line 11
    new-instance v0, Lsp;

    .line 12
    .line 13
    invoke-direct {v0}, Lsp;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ljc0;->e:Lsp;

    .line 17
    .line 18
    return-void
.end method

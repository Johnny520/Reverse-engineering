.class public final Lf7;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lzn2;


# instance fields
.field public h:Z

.field public final synthetic i:Leq2;


# direct methods
.method public constructor <init>(Leq2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf7;->i:Leq2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lyn2;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lf7;->i:Leq2;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lf7;->h:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

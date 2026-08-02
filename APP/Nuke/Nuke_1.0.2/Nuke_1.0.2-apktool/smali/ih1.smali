.class public final Lih1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:La51;

.field public final b:Ljava/util/List;

.field public final c:Lf40;


# direct methods
.method public constructor <init>(La51;Lf40;)V
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Argument must not be null"

    .line 7
    .line 8
    invoke-static {v1, p1}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lih1;->a:La51;

    .line 12
    .line 13
    invoke-static {v1, v0}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lih1;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1, p2}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lih1;->c:Lf40;

    .line 22
    .line 23
    return-void
.end method

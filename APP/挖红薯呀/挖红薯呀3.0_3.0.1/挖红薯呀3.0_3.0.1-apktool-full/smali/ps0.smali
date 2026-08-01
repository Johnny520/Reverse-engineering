.class public final Lps0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Loh0;
.implements Lyk;


# instance fields
.field public final synthetic d:Loh0;

.field public final e:Lpk;


# direct methods
.method public constructor <init>(Loh0;Lpk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lps0;->d:Loh0;

    .line 5
    .line 6
    iput-object p2, p0, Lps0;->e:Lpk;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f()Lpk;
    .locals 0

    .line 1
    iget-object p0, p0, Lps0;->e:Lpk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lps0;->d:Loh0;

    .line 2
    .line 3
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lps0;->d:Loh0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

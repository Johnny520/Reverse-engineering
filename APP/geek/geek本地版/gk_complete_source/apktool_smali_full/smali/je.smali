.class public final Lje;
.super Ljava/lang/Object;

# interfaces
.implements Lfe;


# instance fields
.field public final a:Lcq;

.field public final b:Lfe;


# direct methods
.method public constructor <init>(Lfe;Lsm;)V
    .locals 1

    .line 1
    const-string v0, "baseKey"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p2, Lcq;

    .line 10
    .line 11
    iput-object p2, p0, Lje;->a:Lcq;

    .line 12
    .line 13
    instance-of p2, p1, Lje;

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    check-cast p1, Lje;

    .line 18
    .line 19
    iget-object p1, p1, Lje;->b:Lfe;

    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lje;->b:Lfe;

    .line 22
    .line 23
    return-void
.end method

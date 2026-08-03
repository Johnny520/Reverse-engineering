.class public final LoC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LoC;

.field public static final b:Lpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LoC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LoC;->a:LoC;

    const-string v0, "kotlin.ULong"

    sget-object v1, Lup;->a:Lup;

    invoke-static {v1, v0}, LDc;->a(LQm;Ljava/lang/String;)Lpl;

    move-result-object v0

    sput-object v0, LoC;->b:Lpl;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 2

    sget-object v0, LoC;->b:Lpl;

    invoke-interface {p1, v0}, LJc;->u(LCx;)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->a()J

    move-result-wide v0

    new-instance p1, LkC;

    invoke-direct {p1, v0, v1}, LkC;-><init>(J)V

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LoC;->b:Lpl;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LkC;

    iget-wide p1, p2, LkC;->a:J

    const/4 p1, 0x0

    throw p1
.end method

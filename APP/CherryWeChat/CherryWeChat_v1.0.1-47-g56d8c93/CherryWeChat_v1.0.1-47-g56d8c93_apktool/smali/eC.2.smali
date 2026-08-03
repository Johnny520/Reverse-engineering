.class public final LeC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LeC;

.field public static final b:Lpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LeC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LeC;->a:LeC;

    const-string v0, "kotlin.UByte"

    sget-object v1, Lu6;->a:Lu6;

    invoke-static {v1, v0}, LDc;->a(LQm;Ljava/lang/String;)Lpl;

    move-result-object v0

    sput-object v0, LeC;->b:Lpl;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    sget-object v0, LeC;->b:Lpl;

    invoke-interface {p1, v0}, LJc;->u(LCx;)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->t()B

    move-result p1

    new-instance v0, LaC;

    invoke-direct {v0, p1}, LaC;-><init>(B)V

    return-object v0
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LeC;->b:Lpl;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LaC;

    iget-byte p1, p2, LaC;->a:B

    const/4 p1, 0x0

    throw p1
.end method

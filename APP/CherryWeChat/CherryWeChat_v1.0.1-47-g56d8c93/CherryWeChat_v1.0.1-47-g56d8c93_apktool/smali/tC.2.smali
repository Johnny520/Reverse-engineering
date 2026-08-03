.class public final LtC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LtC;

.field public static final b:Lpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LtC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LtC;->a:LtC;

    const-string v0, "kotlin.UShort"

    sget-object v1, Ljy;->a:Ljy;

    invoke-static {v1, v0}, LDc;->a(LQm;Ljava/lang/String;)Lpl;

    move-result-object v0

    sput-object v0, LtC;->b:Lpl;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    sget-object v0, LtC;->b:Lpl;

    invoke-interface {p1, v0}, LJc;->u(LCx;)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->x()S

    move-result p1

    new-instance v0, LpC;

    invoke-direct {v0, p1}, LpC;-><init>(S)V

    return-object v0
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LtC;->b:Lpl;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LpC;

    iget-short p1, p2, LpC;->a:S

    const/4 p1, 0x0

    throw p1
.end method

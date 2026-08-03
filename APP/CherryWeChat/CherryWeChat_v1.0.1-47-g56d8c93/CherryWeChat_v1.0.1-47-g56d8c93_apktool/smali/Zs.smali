.class public final LZs;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LZs;

.field public static final b:LYs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZs;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LZs;->a:LZs;

    sget-object v0, LYs;->a:LYs;

    sput-object v0, LZs;->b:LYs;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LHx;

    const-string v0, "\'kotlin.Nothing\' does not have instances"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LZs;->b:LYs;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Void;

    new-instance p1, LHx;

    const-string p2, "\'kotlin.Nothing\' cannot be serialized"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

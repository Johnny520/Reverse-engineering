.class public final LVC;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final b:LVC;


# instance fields
.field public final synthetic a:Lft;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVC;

    invoke-direct {v0}, LVC;-><init>()V

    sput-object v0, LVC;->b:LVC;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lft;

    invoke-direct {v0}, Lft;-><init>()V

    iput-object v0, p0, LVC;->a:Lft;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LVC;->a:Lft;

    invoke-virtual {v0, p1}, Lft;->deserialize(LJc;)Ljava/lang/Object;

    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, LVC;->a:Lft;

    invoke-virtual {v0}, Lft;->getDescriptor()LCx;

    move-result-object v0

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LTC;

    iget-object p1, p0, LVC;->a:Lft;

    invoke-virtual {p1}, Lft;->getDescriptor()LCx;

    const/4 p1, 0x0

    throw p1
.end method

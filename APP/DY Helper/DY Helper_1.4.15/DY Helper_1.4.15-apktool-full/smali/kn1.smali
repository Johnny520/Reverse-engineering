.class public final Lkn1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic δ:I


# instance fields
.field public final synthetic α:Lez0;

.field public final synthetic β:I

.field public final synthetic γ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ldd;->θ:Ldd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lez0;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkn1;->α:Lez0;

    .line 5
    .line 6
    iput p2, p0, Lkn1;->β:I

    .line 7
    .line 8
    iput-object p3, p0, Lkn1;->γ:[B

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final α()J
    .locals 2

    .line 1
    iget p0, p0, Lkn1;->β:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

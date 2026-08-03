.class public La/I9$b;
.super La/Dg;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/I9;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final e:La/I9$b$a;


# instance fields
.field public final d:La/oe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/oe<",
            "La/I9$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/I9$b$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/I9$b;->e:La/I9$b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/Dg;-><init>()V

    new-instance v0, La/oe;

    invoke-direct {v0}, La/oe;-><init>()V

    iput-object v0, p0, La/I9$b;->d:La/oe;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, La/I9$b;->d:La/oe;

    iget v1, v0, La/oe;->c:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-gtz v1, :cond_1

    iget-object v4, v0, La/oe;->b:[Ljava/lang/Object;

    move v5, v3

    :goto_0
    if-ge v5, v1, :cond_0

    aput-object v2, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v3, v0, La/oe;->c:I

    return-void

    :cond_1
    iget-object v0, v0, La/oe;->b:[Ljava/lang/Object;

    aget-object v0, v0, v3

    check-cast v0, La/I9$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v2
.end method

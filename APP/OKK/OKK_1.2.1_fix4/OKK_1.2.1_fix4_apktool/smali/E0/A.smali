.class public final LE0/A;
.super LE0/b;
.source "SourceFile"


# instance fields
.field public c:I

.field public d:I

.field public final synthetic e:LE0/B;


# direct methods
.method public constructor <init>(LE0/B;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE0/A;->e:LE0/B;

    invoke-virtual {p1}, LE0/B;->a()I

    move-result v0

    iput v0, p0, LE0/A;->c:I

    iget p1, p1, LE0/B;->c:I

    iput p1, p0, LE0/A;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget v0, p0, LE0/A;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x2

    iput v0, p0, LE0/b;->a:I

    goto :goto_0

    :cond_0
    iget-object v1, p0, LE0/A;->e:LE0/B;

    iget-object v2, v1, LE0/B;->a:[Ljava/lang/Object;

    iget v3, p0, LE0/A;->d:I

    aget-object v2, v2, v3

    iput-object v2, p0, LE0/b;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, LE0/b;->a:I

    add-int/2addr v3, v2

    iget v1, v1, LE0/B;->b:I

    rem-int/2addr v3, v1

    iput v3, p0, LE0/A;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LE0/A;->c:I

    :goto_0
    return-void
.end method

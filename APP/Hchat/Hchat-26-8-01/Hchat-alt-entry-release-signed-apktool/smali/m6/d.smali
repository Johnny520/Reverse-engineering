.class public final Lm6/d;
.super Lh6/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lm6/c;


# instance fields
.field public final a:Lh6/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm6/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lm6/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm6/d;->b:Lm6/c;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lh6/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm6/d;->a:Lh6/n;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lo6/a;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ljava/sql/Timestamp;

    .line 2
    .line 3
    iget-object v0, p0, Lm6/d;->a:Lh6/n;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

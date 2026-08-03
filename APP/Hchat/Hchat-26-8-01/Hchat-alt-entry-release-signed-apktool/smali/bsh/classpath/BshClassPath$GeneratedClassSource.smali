.class public Lbsh/classpath/BshClassPath$GeneratedClassSource;
.super Lbsh/classpath/BshClassPath$ClassSource;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/classpath/BshClassPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GeneratedClassSource"
.end annotation


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbsh/classpath/BshClassPath$ClassSource;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/classpath/BshClassPath$ClassSource;->source:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getCode(Ljava/lang/String;)[B
    .locals 0

    .line 1
    iget-object p1, p0, Lbsh/classpath/BshClassPath$ClassSource;->source:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, [B

    .line 4
    .line 5
    return-object p1
.end method

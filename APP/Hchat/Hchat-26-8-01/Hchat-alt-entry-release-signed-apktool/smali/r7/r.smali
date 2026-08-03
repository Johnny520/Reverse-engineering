.class public abstract Lr7/r;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final n:Ljava/nio/charset/CharsetDecoder;


# instance fields
.field public m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lr7/r;->n:Ljava/nio/charset/CharsetDecoder;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final L()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr7/r;->N([B)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lr7/r;->m:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public abstract N([B)Ljava/lang/String;
.end method

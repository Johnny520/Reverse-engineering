.class public Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/build/RenamingPlugin$Renaming;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/RenamingPlugin$Renaming;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForPattern"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final pattern:Ljava/util/regex/Pattern;

.field private final replacement:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/regex/Pattern;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->pattern:Ljava/util/regex/Pattern;

    iput-object p2, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->replacement:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->replacement:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->replacement:Ljava/lang/String;

    check-cast p1, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;

    iget-object v3, p1, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->replacement:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->pattern:Ljava/util/regex/Pattern;

    iget-object p1, p1, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/build/RenamingPlugin$Renaming$ForPattern;->replacement:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


package dad.openlibrary.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javafx.beans.value.ObservableValue;

public class Doc {

    @SerializedName("author_alternative_name")
    @Expose
    private List<String> authorAlternativeName;
    @SerializedName("author_key")
    @Expose
    private List<String> authorKey;
    @SerializedName("author_name")
    @Expose
    private List<String> authorName;
    @SerializedName("contributor")
    @Expose
    private List<String> contributor;
    @SerializedName("cover_edition_key")
    @Expose
    private String coverEditionKey;
    @SerializedName("cover_i")
    @Expose
    private Integer coverI;
    @SerializedName("ddc")
    @Expose
    private List<String> ddc;
    @SerializedName("ebook_access")
    @Expose
    private String ebookAccess;
    @SerializedName("ebook_count_i")
    @Expose
    private Integer ebookCountI;
    @SerializedName("edition_count")
    @Expose
    private Integer editionCount;
    @SerializedName("edition_key")
    @Expose
    private List<String> editionKey;
    @SerializedName("first_publish_year")
    @Expose
    private Integer firstPublishYear;
    @SerializedName("format")
    @Expose
    private List<String> format;
    @SerializedName("has_fulltext")
    @Expose
    private Boolean hasFulltext;
    @SerializedName("ia")
    @Expose
    private List<String> ia;
    @SerializedName("ia_collection")
    @Expose
    private List<String> iaCollection;
    @SerializedName("ia_collection_s")
    @Expose
    private String iaCollectionS;
    @SerializedName("isbn")
    @Expose
    private List<String> isbn;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("language")
    @Expose
    private List<String> language;
    @SerializedName("last_modified_i")
    @Expose
    private Integer lastModifiedI;
    @SerializedName("lcc")
    @Expose
    private List<String> lcc;
    @SerializedName("lccn")
    @Expose
    private List<String> lccn;
    @SerializedName("lending_edition_s")
    @Expose
    private String lendingEditionS;
    @SerializedName("lending_identifier_s")
    @Expose
    private String lendingIdentifierS;
    @SerializedName("number_of_pages_median")
    @Expose
    private Integer numberOfPagesMedian;
    @SerializedName("oclc")
    @Expose
    private List<String> oclc;
    @SerializedName("osp_count")
    @Expose
    private Integer ospCount;
    @SerializedName("printdisabled_s")
    @Expose
    private String printdisabledS;
    @SerializedName("public_scan_b")
    @Expose
    private Boolean publicScanB;
    @SerializedName("publish_date")
    @Expose
    private List<String> publishDate;
    @SerializedName("publish_place")
    @Expose
    private List<String> publishPlace;
    @SerializedName("publish_year")
    @Expose
    private List<Integer> publishYear;
    @SerializedName("publisher")
    @Expose
    private List<String> publisher;
    @SerializedName("seed")
    @Expose
    private List<String> seed;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_sort")
    @Expose
    private String titleSort;
    @SerializedName("title_suggest")
    @Expose
    private String titleSuggest;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id_amazon")
    @Expose
    private List<String> idAmazon;
    @SerializedName("id_goodreads")
    @Expose
    private List<String> idGoodreads;
    @SerializedName("id_amazon_co_uk_asin")
    @Expose
    private List<String> idAmazonCoUkAsin;
    @SerializedName("id_canadian_national_library_archive")
    @Expose
    private List<String> idCanadianNationalLibraryArchive;
    @SerializedName("id_librarything")
    @Expose
    private List<String> idLibrarything;
    @SerializedName("id_alibris_id")
    @Expose
    private List<String> idAlibrisId;
    @SerializedName("id_overdrive")
    @Expose
    private List<String> idOverdrive;
    @SerializedName("id_google")
    @Expose
    private List<String> idGoogle;
    @SerializedName("id_british_library")
    @Expose
    private List<String> idBritishLibrary;
    @SerializedName("id_wikidata")
    @Expose
    private List<String> idWikidata;
    @SerializedName("id_amazon_de_asin")
    @Expose
    private List<String> idAmazonDeAsin;
    @SerializedName("id_amazon_ca_asin")
    @Expose
    private List<String> idAmazonCaAsin;
    @SerializedName("id_annas_archive")
    @Expose
    private List<String> idAnnasArchive;
    @SerializedName("id_british_national_bibliography")
    @Expose
    private List<String> idBritishNationalBibliography;
    @SerializedName("id_libris")
    @Expose
    private List<String> idLibris;
    @SerializedName("id_dep\u00f3sito_legal")
    @Expose
    private List<String> idDepSitoLegal;
    @SerializedName("id_amazon_it_asin")
    @Expose
    private List<String> idAmazonItAsin;
    @SerializedName("id_isfdb")
    @Expose
    private List<String> idIsfdb;
    @SerializedName("subject")
    @Expose
    private List<String> subject;
    @SerializedName("place")
    @Expose
    private List<String> place;
    @SerializedName("person")
    @Expose
    private List<String> person;
    @SerializedName("ia_box_id")
    @Expose
    private List<String> iaBoxId;
    @SerializedName("ratings_average")
    @Expose
    private Double ratingsAverage;
    @SerializedName("ratings_sortable")
    @Expose
    private Double ratingsSortable;
    @SerializedName("ratings_count")
    @Expose
    private Integer ratingsCount;
    @SerializedName("ratings_count_1")
    @Expose
    private Integer ratingsCount1;
    @SerializedName("ratings_count_2")
    @Expose
    private Integer ratingsCount2;
    @SerializedName("ratings_count_3")
    @Expose
    private Integer ratingsCount3;
    @SerializedName("ratings_count_4")
    @Expose
    private Integer ratingsCount4;
    @SerializedName("ratings_count_5")
    @Expose
    private Integer ratingsCount5;
    @SerializedName("readinglog_count")
    @Expose
    private Integer readinglogCount;
    @SerializedName("want_to_read_count")
    @Expose
    private Integer wantToReadCount;
    @SerializedName("currently_reading_count")
    @Expose
    private Integer currentlyReadingCount;
    @SerializedName("already_read_count")
    @Expose
    private Integer alreadyReadCount;
    @SerializedName("publisher_facet")
    @Expose
    private List<String> publisherFacet;
    @SerializedName("person_key")
    @Expose
    private List<String> personKey;
    @SerializedName("place_key")
    @Expose
    private List<String> placeKey;
    @SerializedName("person_facet")
    @Expose
    private List<String> personFacet;
    @SerializedName("subject_facet")
    @Expose
    private List<String> subjectFacet;
    @SerializedName("_version_")
    @Expose
    private Long version;
    @SerializedName("place_facet")
    @Expose
    private List<String> placeFacet;
    @SerializedName("lcc_sort")
    @Expose
    private String lccSort;
    @SerializedName("author_facet")
    @Expose
    private List<String> authorFacet;
    @SerializedName("subject_key")
    @Expose
    private List<String> subjectKey;
    @SerializedName("ddc_sort")
    @Expose
    private String ddcSort;

    public List<String> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public List<String> getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
    }

    public List<String> getAuthorName() {
        return authorName;
    }

    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    public List<String> getContributor() {
        return contributor;
    }

    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public Integer getCoverI() {
        return coverI;
    }

    public void setCoverI(Integer coverI) {
        this.coverI = coverI;
    }

    public List<String> getDdc() {
        return ddc;
    }

    public void setDdc(List<String> ddc) {
        this.ddc = ddc;
    }

    public String getEbookAccess() {
        return ebookAccess;
    }

    public void setEbookAccess(String ebookAccess) {
        this.ebookAccess = ebookAccess;
    }

    public Integer getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(Integer ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public List<String> getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
    }

    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public List<String> getFormat() {
        return format;
    }

    public void setFormat(List<String> format) {
        this.format = format;
    }

    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public List<String> getIaCollection() {
        return iaCollection;
    }

    public void setIaCollection(List<String> iaCollection) {
        this.iaCollection = iaCollection;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public Integer getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(Integer lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public List<String> getLcc() {
        return lcc;
    }

    public void setLcc(List<String> lcc) {
        this.lcc = lcc;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public String getLendingEditionS() {
        return lendingEditionS;
    }

    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    public Integer getNumberOfPagesMedian() {
        return numberOfPagesMedian;
    }

    public void setNumberOfPagesMedian(Integer numberOfPagesMedian) {
        this.numberOfPagesMedian = numberOfPagesMedian;
    }

    public List<String> getOclc() {
        return oclc;
    }

    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    public Integer getOspCount() {
        return ospCount;
    }

    public void setOspCount(Integer ospCount) {
        this.ospCount = ospCount;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public Boolean getPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public List<String> getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
    }

    public List<String> getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
    }

    public List<Integer> getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getSeed() {
        return seed;
    }

    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSort() {
        return titleSort;
    }

    public void setTitleSort(String titleSort) {
        this.titleSort = titleSort;
    }

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getIdAmazon() {
        return idAmazon;
    }

    public void setIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
    }

    public List<String> getIdGoodreads() {
        return idGoodreads;
    }

    public void setIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    public List<String> getIdAmazonCoUkAsin() {
        return idAmazonCoUkAsin;
    }

    public void setIdAmazonCoUkAsin(List<String> idAmazonCoUkAsin) {
        this.idAmazonCoUkAsin = idAmazonCoUkAsin;
    }

    public List<String> getIdCanadianNationalLibraryArchive() {
        return idCanadianNationalLibraryArchive;
    }

    public void setIdCanadianNationalLibraryArchive(List<String> idCanadianNationalLibraryArchive) {
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
    }

    public List<String> getIdLibrarything() {
        return idLibrarything;
    }

    public void setIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }

    public List<String> getIdAlibrisId() {
        return idAlibrisId;
    }

    public void setIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
    }

    public List<String> getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public List<String> getIdGoogle() {
        return idGoogle;
    }

    public void setIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
    }

    public List<String> getIdBritishLibrary() {
        return idBritishLibrary;
    }

    public void setIdBritishLibrary(List<String> idBritishLibrary) {
        this.idBritishLibrary = idBritishLibrary;
    }

    public List<String> getIdWikidata() {
        return idWikidata;
    }

    public void setIdWikidata(List<String> idWikidata) {
        this.idWikidata = idWikidata;
    }

    public List<String> getIdAmazonDeAsin() {
        return idAmazonDeAsin;
    }

    public void setIdAmazonDeAsin(List<String> idAmazonDeAsin) {
        this.idAmazonDeAsin = idAmazonDeAsin;
    }

    public List<String> getIdAmazonCaAsin() {
        return idAmazonCaAsin;
    }

    public void setIdAmazonCaAsin(List<String> idAmazonCaAsin) {
        this.idAmazonCaAsin = idAmazonCaAsin;
    }

    public List<String> getIdAnnasArchive() {
        return idAnnasArchive;
    }

    public void setIdAnnasArchive(List<String> idAnnasArchive) {
        this.idAnnasArchive = idAnnasArchive;
    }

    public List<String> getIdBritishNationalBibliography() {
        return idBritishNationalBibliography;
    }

    public void setIdBritishNationalBibliography(List<String> idBritishNationalBibliography) {
        this.idBritishNationalBibliography = idBritishNationalBibliography;
    }

    public List<String> getIdLibris() {
        return idLibris;
    }

    public void setIdLibris(List<String> idLibris) {
        this.idLibris = idLibris;
    }

    public List<String> getIdDepSitoLegal() {
        return idDepSitoLegal;
    }

    public void setIdDepSitoLegal(List<String> idDepSitoLegal) {
        this.idDepSitoLegal = idDepSitoLegal;
    }

    public List<String> getIdAmazonItAsin() {
        return idAmazonItAsin;
    }

    public void setIdAmazonItAsin(List<String> idAmazonItAsin) {
        this.idAmazonItAsin = idAmazonItAsin;
    }

    public List<String> getIdIsfdb() {
        return idIsfdb;
    }

    public void setIdIsfdb(List<String> idIsfdb) {
        this.idIsfdb = idIsfdb;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public List<String> getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public Double getRatingsAverage() {
        return ratingsAverage;
    }

    public void setRatingsAverage(Double ratingsAverage) {
        this.ratingsAverage = ratingsAverage;
    }

    public Double getRatingsSortable() {
        return ratingsSortable;
    }

    public void setRatingsSortable(Double ratingsSortable) {
        this.ratingsSortable = ratingsSortable;
    }

    public Integer getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(Integer ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public Integer getRatingsCount1() {
        return ratingsCount1;
    }

    public void setRatingsCount1(Integer ratingsCount1) {
        this.ratingsCount1 = ratingsCount1;
    }

    public Integer getRatingsCount2() {
        return ratingsCount2;
    }

    public void setRatingsCount2(Integer ratingsCount2) {
        this.ratingsCount2 = ratingsCount2;
    }

    public Integer getRatingsCount3() {
        return ratingsCount3;
    }

    public void setRatingsCount3(Integer ratingsCount3) {
        this.ratingsCount3 = ratingsCount3;
    }

    public Integer getRatingsCount4() {
        return ratingsCount4;
    }

    public void setRatingsCount4(Integer ratingsCount4) {
        this.ratingsCount4 = ratingsCount4;
    }

    public Integer getRatingsCount5() {
        return ratingsCount5;
    }

    public void setRatingsCount5(Integer ratingsCount5) {
        this.ratingsCount5 = ratingsCount5;
    }

    public Integer getReadinglogCount() {
        return readinglogCount;
    }

    public void setReadinglogCount(Integer readinglogCount) {
        this.readinglogCount = readinglogCount;
    }

    public Integer getWantToReadCount() {
        return wantToReadCount;
    }

    public void setWantToReadCount(Integer wantToReadCount) {
        this.wantToReadCount = wantToReadCount;
    }

    public Integer getCurrentlyReadingCount() {
        return currentlyReadingCount;
    }

    public void setCurrentlyReadingCount(Integer currentlyReadingCount) {
        this.currentlyReadingCount = currentlyReadingCount;
    }

    public Integer getAlreadyReadCount() {
        return alreadyReadCount;
    }

    public void setAlreadyReadCount(Integer alreadyReadCount) {
        this.alreadyReadCount = alreadyReadCount;
    }

    public List<String> getPublisherFacet() {
        return publisherFacet;
    }

    public void setPublisherFacet(List<String> publisherFacet) {
        this.publisherFacet = publisherFacet;
    }

    public List<String> getPersonKey() {
        return personKey;
    }

    public void setPersonKey(List<String> personKey) {
        this.personKey = personKey;
    }

    public List<String> getPlaceKey() {
        return placeKey;
    }

    public void setPlaceKey(List<String> placeKey) {
        this.placeKey = placeKey;
    }

    public List<String> getPersonFacet() {
        return personFacet;
    }

    public void setPersonFacet(List<String> personFacet) {
        this.personFacet = personFacet;
    }

    public List<String> getSubjectFacet() {
        return subjectFacet;
    }

    public void setSubjectFacet(List<String> subjectFacet) {
        this.subjectFacet = subjectFacet;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<String> getPlaceFacet() {
        return placeFacet;
    }

    public void setPlaceFacet(List<String> placeFacet) {
        this.placeFacet = placeFacet;
    }

    public String getLccSort() {
        return lccSort;
    }

    public void setLccSort(String lccSort) {
        this.lccSort = lccSort;
    }

    public List<String> getAuthorFacet() {
        return authorFacet;
    }

    public void setAuthorFacet(List<String> authorFacet) {
        this.authorFacet = authorFacet;
    }

    public List<String> getSubjectKey() {
        return subjectKey;
    }

    public void setSubjectKey(List<String> subjectKey) {
        this.subjectKey = subjectKey;
    }

    public String getDdcSort() {
        return ddcSort;
    }

    public void setDdcSort(String ddcSort) {
        this.ddcSort = ddcSort;
    }

    public ObservableValue<String> titleProperty() {
        return null;
    }

    public ObservableValue<String> authorProperty() {
        return null;
    }

    public ObservableValue<String> publisherProperty() {
        return null;
    }

    public ObservableValue<String> isbnProperty() {
        return null;
    }

    public ObservableValue<Number> pagesProperty() {
        return null;
    }
}